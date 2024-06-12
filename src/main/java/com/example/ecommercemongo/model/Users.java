package com.example.ecommercemongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Users {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String role;

    public Users(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
}

