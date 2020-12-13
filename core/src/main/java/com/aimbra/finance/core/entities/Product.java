package com.aimbra.finance.core.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "abrprod")
@Data
public class Product implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name="title", length = 128, unique = true, nullable = false)
    private String title;
}
