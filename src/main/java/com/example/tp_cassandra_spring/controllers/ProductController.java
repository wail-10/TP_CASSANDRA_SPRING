package com.example.tp_cassandra_spring.controllers;

import com.example.tp_cassandra_spring.entities.Product;
import com.example.tp_cassandra_spring.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable UUID id) {
        return productService.getProductById(id);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String name) {
        return productService.searchProducts(name);
    }


    @PostMapping
    public String saveProduct(@RequestParam String name, @RequestParam double price, @RequestParam int quantity) {
        productService.saveProduct(name, price, quantity);
        return "Product saved successfully";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable UUID id, @RequestParam String name, @RequestParam double price, @RequestParam int quantity) {
        productService.updateProduct(id, name, price, quantity);
        return "Product updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }
}
