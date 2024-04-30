package com.shoprabbit.serviceImpl;

import com.shoprabbit.models.Product;
import com.shoprabbit.models.ProductListReq;
import com.shoprabbit.repository.CommonRepository;
import com.shoprabbit.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    CommonRepository commonRepository;
    @Override
    public List<Product> getListofProducts(ProductListReq productListReq) {
        String category = productListReq.getCategory();
        String brand = productListReq.getBrand();
        return commonRepository.findByBrandAndCategory(brand, category);
    }
}
