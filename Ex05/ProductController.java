package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET - Xem danh sách
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // POST - Thêm sản phẩm
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // PUT - Cập nhật sản phẩm
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable int id,
            @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    // DELETE - Xóa sản phẩm
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {

        boolean deleted = productService.deleteProduct(id);

        if (deleted) {
            return "Xóa sản phẩm thành công";
        }

        return "Không tìm thấy sản phẩm";
    }
}