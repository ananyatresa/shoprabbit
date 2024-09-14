package com.shoprabbit.repository;
import com.shoprabbit.config.DatabaseConfig;
import com.shoprabbit.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommonRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);

    @Query("SELECT p FROM Product p WHERE LOWER(p.title) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Product> findByTitle(@Param("keyword") String keyword);

}
