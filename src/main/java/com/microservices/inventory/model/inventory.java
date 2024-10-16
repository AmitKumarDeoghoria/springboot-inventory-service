package com.microservices.inventory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t_inventory")
@Getter
@Setter
@RequiredArgsConstructor


public class inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String skuCode;
    private Integer quantity;
    private Integer batch;


}
