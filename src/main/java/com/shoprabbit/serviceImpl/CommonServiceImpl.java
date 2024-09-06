package com.shoprabbit.serviceImpl;

import com.shoprabbit.models.CategoryRequest;
import com.shoprabbit.models.Product;
import com.shoprabbit.models.SearchRequest;
import com.shoprabbit.repository.CommonRepository;
import com.shoprabbit.services.CommonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    private static final Logger logger = LogManager.getLogger(CommonServiceImpl.class);

    @Autowired
    CommonRepository commonRepository;
    @Override
    public List<Product> getListofProducts() {
        logger.info("Querying table for all products ...");
        List<Product> productsList = commonRepository.findAll();
        if (productsList.isEmpty()){
            logger.info("No products exist in table `shop_rabbit.product_details` ");
        }
        return productsList;
    }

    @Override
    public List<Product> getCategoryProducts(CategoryRequest categoryRequest) {
        String category = categoryRequest.getCategory();
        logger.info("Querying table for category :" + category);
        List<Product> productsList = commonRepository.findByCategory(category);
        if (productsList.isEmpty()){
            logger.info("No products exist for category :" + category);
        }
        return productsList;
    }

    @Override
    public List<Product> getSearchProducts(SearchRequest searchRequest) {
        String keyword = searchRequest.getKeyword();
        logger.info("Querying table for keyword :" + keyword);
        List<Product> productsList = commonRepository.findByTitle(keyword);
        if (productsList.isEmpty()){
            logger.info("No products exist for keyword :" + keyword);
        }
        return productsList;
    }
}
