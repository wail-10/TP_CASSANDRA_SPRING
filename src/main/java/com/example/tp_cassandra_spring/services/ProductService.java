package com.example.tp_cassandra_spring.services;

import com.example.tp_cassandra_spring.entities.Product;
import com.example.tp_cassandra_spring.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(String name, double price, int quantity) {
        Product product = new Product(UUID.randomUUID(), name, price, quantity);
        productRepository.save(product);
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(UUID id, String name, double price, int quantity) {
        Product product = new Product(id, name, price, quantity);
        productRepository.save(product);
    }
}
