package com.example.machineTest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    private String name;


    private Double price;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

    public Product(){}

    public Product(String name, double price, Category category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}

