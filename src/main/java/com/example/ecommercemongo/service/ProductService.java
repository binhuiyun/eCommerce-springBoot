package com.example.ecommercemongo.service;

import com.example.ecommercemongo.model.Products;
import com.example.ecommercemongo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Products getProductById(String id){
        return productRepository.findById(id).orElse(null);
    }

    public void createProduct(Products product){
        productRepository.save(product);
        log.info("Product created successfully", product.getId());
    }

    public Products updateProduct(Products product){
        return productRepository.save(product);
    }

    public List<Products> getSearchProducts(String name){
        return productRepository.findByNameContaining(name);
    }
}
