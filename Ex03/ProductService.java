package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Laptop", 15000000));
        products.add(new Product(2, "Mouse", 300000));
        products.add(new Product(3, "Keyboard", 800000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}