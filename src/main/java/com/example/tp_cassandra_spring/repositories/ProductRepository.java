package com.example.tp_cassandra_spring.repositories;

import com.example.tp_cassandra_spring.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID>{
}
