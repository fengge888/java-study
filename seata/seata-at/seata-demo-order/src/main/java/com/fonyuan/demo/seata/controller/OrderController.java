package com.fonyuan.demo.seata.controller;

import com.fonyuan.demo.seata.controller.model.CreateOrderRequestBody;
import com.fonyuan.demo.seata.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    private ApplicationContext applicationContext;


    @PostMapping("/createOrder")
    @GlobalTransactional(timeoutMills = 600000, name = "create_order_tx")
    @Transactional
    public String createOrder(@RequestBody CreateOrderRequestBody orderRequestBody) throws InterruptedException, SQLException {


        return orderService.createOrder(orderRequestBody.getUserId(),
                orderRequestBody.getOrderId(), orderRequestBody.getPsSkuCode(), orderRequestBody.getQty());


    }

}
