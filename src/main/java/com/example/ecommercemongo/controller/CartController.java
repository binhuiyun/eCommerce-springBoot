package com.example.ecommercemongo.controller;

import com.example.ecommercemongo.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CartController {
    private final CartService cartService;

//    @GetMapping("/api/cart/{uid}")
//    public Carts fetchCartByUserId (@PathVariable String uid){
//        return cartService.getCartById(uid);
//    }
//
//    @PostMapping("/api/cart/add")
//    public Carts addToCart(Carts cart){
//        return cartService.updateCart(cart);
//    }
//    @PostMapping("/api/cart/remove")
//    public Carts removeFromCart(Carts cart){
//        return cartService.createCart(cart);
//    }
}
