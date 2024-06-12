package com.example.ecommercemongo.service;

import com.example.ecommercemongo.model.Carts;
import com.example.ecommercemongo.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CartService {
    private final CartRepository cartRepository;
    private final ProductService productService;

    public Carts getCartByUserId(String id){
        return cartRepository.findById(id).orElse(null);
    }



}
