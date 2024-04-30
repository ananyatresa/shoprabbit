package com.shoprabbit.services;

import com.shoprabbit.models.Product;
import com.shoprabbit.models.ProductListReq;

import java.util.List;

public interface CommonService {

    List<Product> getListofProducts(ProductListReq productListReq);
}
