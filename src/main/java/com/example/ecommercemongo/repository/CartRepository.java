package com.example.ecommercemongo.repository;

import com.example.ecommercemongo.model.Carts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Carts, String> {
}
