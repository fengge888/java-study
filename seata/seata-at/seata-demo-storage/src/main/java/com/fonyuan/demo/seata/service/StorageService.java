package com.fonyuan.demo.seata.service;

import com.fonyuan.demo.seata.dao.repository.StorageRepository;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    //    @GlobalTransactional(timeoutMills = 600000)
    public String deductStorage(String psSkuCode, int qty) {
        String xid = RootContext.getXID();
        if (log.isDebugEnabled()) {
            log.debug("Start---Transaction--XID={}};BranchType={}", xid, RootContext.getBranchType());
        }

        int result = storageRepository.deductStorage(psSkuCode, qty);

        return "ok--" + result + "---" + qty;
    }

}
