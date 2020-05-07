package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String name;

    @NotBlank(message = "You don't enter store image")
    @Column(length = 128)
    private String image;

    @NotBlank(message = "You don't enter store address")
    @Column(length = 128)
    private String address;

    @NotBlank(message = "You don't enter store name")
    @Column(length = 128)
    private String description;

}
