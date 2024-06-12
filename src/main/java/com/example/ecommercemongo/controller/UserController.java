package com.example.ecommercemongo.controller;

import com.example.ecommercemongo.service.UserService;
import com.example.ecommercemongo.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;
    @GetMapping("/api/users")
    public List<Users> fetchAllUsers(){
        return userService.getAllUsers();
    }
}
