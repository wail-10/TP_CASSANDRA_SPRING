package com.example.tp_cassandra_spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("categories")
@AllArgsConstructor @NoArgsConstructor @Data
public class Category {
    @PrimaryKey
    private UUID id;
    private String name;

}
