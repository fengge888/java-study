package com.fonyuan.demo.seata.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo_storage")
public class StorageEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String psSkuCode;

    private int qty;
}
