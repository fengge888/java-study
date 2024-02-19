package com.fonyuan.demo.seata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "seata-at-demo-storage")
public interface StorageFeignClient {

    @PostMapping("/useStorage")
    String useStorage(@RequestParam(name = "orderId") String orderId,
                      @RequestParam(name = "psSkuCode") String psSkuCode,
                      @RequestParam(name = "qty") int qty);
}
