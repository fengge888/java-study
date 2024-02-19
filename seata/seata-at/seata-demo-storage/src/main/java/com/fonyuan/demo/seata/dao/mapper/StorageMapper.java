package com.fonyuan.demo.seata.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fonyuan.demo.seata.dao.entity.StorageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StorageMapper extends BaseMapper<StorageEntity> {
    @Update("UPDATE demo_storage SET qty=qty - #{qty} WHERE ps_sku_code=#{psSkuCode}")
    int deductStorage(@Param("psSkuCode") String psSkuCode, @Param("qty") int qty);
}
