package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Entity
@Table(name = "buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "You don't enter buyer name")
    @Column(length = 128)
    private String name;

    @NotBlank(message = "You don't enter buyer surname")
    @Column(length = 128)
    private String surname;

    @NotBlank(message = "You don't enter buyer email")
    @Email(message = "You don't enter email's parameters")
    @Column(length = 128)
    private String email;

    @NotBlank(message = "You don't enter buyer password")
    @Size(min = 8, message = "Password should be bigger than 8")
    @Column(length = 128)
    private String password;

}
