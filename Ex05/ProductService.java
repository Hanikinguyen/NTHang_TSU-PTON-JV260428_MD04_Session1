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

    // GET - Lấy danh sách sản phẩm
    public List<Product> getAllProducts() {
        return products;
    }

    // POST - Thêm sản phẩm
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    // PUT - Cập nhật sản phẩm
    public Product updateProduct(int id, Product product) {

        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return p;
            }
        }

        return null;
    }

    // DELETE - Xóa sản phẩm
    public boolean deleteProduct(int id) {

        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                return true;
            }
        }

        return false;
    }
}