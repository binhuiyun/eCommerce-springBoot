package com.example.ecommercemongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carts {
    @Id
    private String id;
    private String userId;
    private String productId;
    private int quantity;
    private double price;
    private double totalPrice;

    public Carts( String productId, int quantity, double price, double totalPrice) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }
}
