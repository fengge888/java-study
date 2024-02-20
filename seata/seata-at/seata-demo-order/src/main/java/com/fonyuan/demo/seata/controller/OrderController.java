package com.fonyuan.demo.seata.controller;

import com.fonyuan.demo.seata.controller.model.CreateOrderRequestBody;
import com.fonyuan.demo.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    private ApplicationContext applicationContext;


    @PostMapping("/seata/at/createOrder")
    public String createOrder(@RequestBody CreateOrderRequestBody orderRequestBody)
            throws InterruptedException {

        return orderService.createOrder(orderRequestBody.getUserId(),
                orderRequestBody.getOrderId(), orderRequestBody.getPsSkuCode(),
                orderRequestBody.getQty());

    }

}
