package com.fonyuan.demo.seata.controller;

import com.fonyuan.demo.seata.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/useStorage")
    public String useStorage(@RequestParam(name = "orderId") String orderId,
                             @RequestParam(name = "psSkuCode") String psSkuCode,
                             @RequestParam(name = "qty") int qty) throws Exception {

        return storageService.deductStorage(psSkuCode, qty);
    }
}
