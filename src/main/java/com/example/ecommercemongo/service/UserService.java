package com.example.ecommercemongo.service;

import com.example.ecommercemongo.repository.UserRepository;
import com.example.ecommercemongo.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

}
