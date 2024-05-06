package com.example.tp_cassandra_spring.repositories;

import com.example.tp_cassandra_spring.entities.Category;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface CategoryRepository extends CassandraRepository<Category, UUID> {

}
