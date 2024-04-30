package com.shoprabbit.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")
public class Product {

    @Id
    @Column(name = "productId")
    private String productId;
    @Column(name = "title")
    private String title;
    @Column(name = "brand")
    private String brand;
    @Column(name = "category")
    private String category;
    @Column(name = "MRP")
    private float MRP;

}
