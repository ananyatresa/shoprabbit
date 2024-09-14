package com.shoprabbit.services;

import com.shoprabbit.models.CategoryRequest;
import com.shoprabbit.models.Product;
import com.shoprabbit.models.SearchRequest;

import java.util.List;

public interface CommonService {

    List<Product> getListofProducts();

    List<Product> getCategoryProducts(CategoryRequest categoryRequest);

    List<Product> getSearchProducts(SearchRequest searchRequest);
}
