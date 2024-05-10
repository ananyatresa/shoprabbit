package com.shoprabbit.repository;
import com.shoprabbit.config.DatabaseConfig;
import com.shoprabbit.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommonRepository extends JpaRepository<Product, Long> {

//    @Autowired
//    DatabaseConfig databaseConfig;

    List<Product> findByBrandAndCategory(String brand, String category);

}
