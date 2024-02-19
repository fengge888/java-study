package com.fonyuan.demo.seata.dao.repository.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fonyuan.demo.seata.dao.entity.OrderInfoEntity;
import com.fonyuan.demo.seata.dao.mapper.OrderMapper;
import com.fonyuan.demo.seata.dao.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderRepositoryImpl
        extends ServiceImpl<OrderMapper, OrderInfoEntity>
        implements OrderRepository {
}
