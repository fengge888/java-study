package com.fonyuan.demo.seata.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fonyuan.demo.seata.dao.entity.OrderInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderInfoEntity> {
}
