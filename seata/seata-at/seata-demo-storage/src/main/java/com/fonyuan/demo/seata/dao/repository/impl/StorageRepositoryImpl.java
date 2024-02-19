package com.fonyuan.demo.seata.dao.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fonyuan.demo.seata.dao.entity.StorageEntity;
import com.fonyuan.demo.seata.dao.mapper.StorageMapper;
import com.fonyuan.demo.seata.dao.repository.StorageRepository;
import org.springframework.stereotype.Service;

@Service
public class StorageRepositoryImpl
        extends ServiceImpl<StorageMapper, StorageEntity>
        implements StorageRepository {
    @Override
    public int deductStorage(String psSkuCode, int qty) {
        return this.getBaseMapper().deductStorage(psSkuCode, qty);
    }
}
