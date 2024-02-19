package com.fonyuan.demo.seata.dao.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fonyuan.demo.seata.dao.entity.StorageEntity;

public interface StorageRepository extends IService<StorageEntity> {

    int deductStorage(String psSkuCode, int qty);

}
