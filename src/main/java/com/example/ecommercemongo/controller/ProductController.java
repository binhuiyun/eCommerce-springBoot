package com.example.ecommercemongo.controller;

import com.example.ecommercemongo.model.Products;
import com.example.ecommercemongo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/api/product")
    public List<Products> fetchAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/api/product/{id}")
    public Products fetchProductById (@PathVariable String id){
        return productService.getProductById(id);
    }
    @GetMapping("/api/product/search/{searchKey}")
    public List<Products> fetchSearchProducts(@PathVariable String searchKey){
        return productService.getSearchProducts(searchKey);
    }
    @PutMapping("/api/product")
    public Products updateProduct(Products product){
        return productService.updateProduct(product);
    }
    @PostMapping("/api/product")
    public void createProduct(@RequestBody Products product){
       productService.createProduct(product);
    }
}
