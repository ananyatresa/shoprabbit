package com.shoprabbit.repository;
import com.shoprabbit.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommonRepository extends JpaRepository<Product, Long> {

    List<Product> findByBrandAndCategory(String brand, String category);

}
