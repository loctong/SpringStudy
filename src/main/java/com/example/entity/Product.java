package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Name")
    private String name;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Explanation")
    private String explanation;

}
