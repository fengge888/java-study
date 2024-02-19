package com.fonyuan.demo.seata.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo_order")
public class OrderInfoEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userId;

    private String orderId;

    private String psSkuCode;

    private int qty;
}
