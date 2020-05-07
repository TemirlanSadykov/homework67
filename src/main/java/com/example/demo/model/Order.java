package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Entity
@Table(name = "order")
public class Order {
    public Order(String storeName, String productName, String buyerEmail) {
        this.id = Integer.parseInt(Long.toString(new Date().getTime()).substring(4));
        this.buyerEmail = buyerEmail;
        this.productName = productName;
        this.storeName = storeName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter buyer name")
    @Column(length = 128)
    private String buyerEmail;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String storeName;

    @NotBlank(message = "You don't enter product name")
    @Column(length = 128)
    private String productName;


}
