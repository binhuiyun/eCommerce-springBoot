package com.example.ecommercemongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Products {
    @Id
    private String id;
    private String name;
    private String category;
    private String description;
    private double price;
    private String image;
    private int stockQuantity;

    public Products(String name, String category, String description, double price, String image, int stockQuantity) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.image = image;
        this.stockQuantity = stockQuantity;
    }
}
