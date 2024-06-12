package com.example.ecommercemongo.repository;

import com.example.ecommercemongo.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Products, String>{
    List<Products> findByNameContaining(String name);
    Optional<Products> findById(String id);
}
