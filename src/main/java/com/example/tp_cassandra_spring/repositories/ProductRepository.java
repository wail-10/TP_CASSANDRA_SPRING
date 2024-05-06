package com.example.tp_cassandra_spring.repositories;

import com.example.tp_cassandra_spring.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID>{
    @Query("SELECT * FROM products WHERE name=?0 ALLOW FILTERING")
    List<Product> searchByName(String name);

}
