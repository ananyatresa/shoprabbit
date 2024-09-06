package com.shoprabbit.controllers;

import com.shoprabbit.models.CategoryRequest;
import com.shoprabbit.models.Product;
import com.shoprabbit.models.SearchRequest;
import com.shoprabbit.services.CommonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ShopRabbitController {

    private static final Logger logger = LogManager.getLogger(ShopRabbitController.class);

    @Autowired
    private CommonService commonService;

    @GetMapping("/list_all_products")
    public List<Product> getListofProducts(){
        logger.info("Fetching product details...");
        return commonService.getListofProducts();
    }

    @PostMapping("/get_category_products")
    public List<Product> get_category_products(@RequestBody CategoryRequest categoryRequest){
        logger.info("Fetching category details.. ");
        return commonService.getCategoryProducts(categoryRequest);
    }

    @PostMapping("/search")
    public List<Product> search_keyword(@RequestBody SearchRequest searchRequest){
        logger.info("Fetching search related products.. ");
        return commonService.getSearchProducts(searchRequest);
    }
}

