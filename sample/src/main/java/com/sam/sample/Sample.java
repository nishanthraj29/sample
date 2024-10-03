package com.sam.sample;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sample")
public class Sample {

    @Id
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public double price;

    @Column(nullable = false)
    public int quantity;


}