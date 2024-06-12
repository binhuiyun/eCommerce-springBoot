package com.example.ecommercemongo.repository;

import com.example.ecommercemongo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
//    Optional<User> findUserByEmail()

}
