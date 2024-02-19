package com.fonyuan.demo.seata.service;

import com.fonyuan.demo.seata.dao.entity.OrderInfoEntity;
import com.fonyuan.demo.seata.dao.repository.OrderRepository;
import com.fonyuan.demo.seata.feign.StorageFeignClient;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private StorageFeignClient storageApi;

    @GlobalTransactional(timeoutMills = 600000)
    public String createOrder(String userId, String orderId, String psSkuCode, int qty) throws InterruptedException {

        String xid = RootContext.getXID();
        if (log.isDebugEnabled()) {
            log.debug("Start---Transaction--XID={}};BranchType={}", xid, RootContext.getBranchType());
        }

        OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
        orderInfoEntity.setUserId(userId);
        orderInfoEntity.setOrderId(orderId);
        orderInfoEntity.setPsSkuCode(psSkuCode);
        orderInfoEntity.setQty(qty);

        orderRepository.save(orderInfoEntity);

        storageApi.useStorage(orderId, psSkuCode, qty);

        // 模拟异常信息
        if (StringUtils.equalsIgnoreCase("1234", userId)) {
            throw new RuntimeException("1234--Error");
        }

        return "ok";
    }

}
