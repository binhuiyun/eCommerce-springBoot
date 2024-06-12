package com.example.ecommercemongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceMongoApplication.class, args);
    }
//    @Bean
//    CommandLineRunner runner(UserRepository repository) {
//        return args -> {
//        Users user = new Users("abcd@gmail.com", "pass", "customer");
//        repository.save(user);
//
//    };
//    }

}

