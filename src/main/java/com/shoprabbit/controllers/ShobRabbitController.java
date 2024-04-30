package com.shoprabbit.controllers;

import com.shoprabbit.models.Product;
import com.shoprabbit.models.ProductListReq;
import com.shoprabbit.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShobRabbitController {

    @Autowired
    private CommonService commonService;

    @PostMapping("/list_all_products")
    public List<Product> getListofProducts(@RequestBody ProductListReq productListReq){
        return commonService.getListofProducts(productListReq);
    }
}

