package com.fonyuan.demo.seata.controller.model;

import lombok.Data;

@Data
public class CreateOrderRequestBody {

    private String userId;

    private String orderId;

    private String psSkuCode;

    private int qty;

}
