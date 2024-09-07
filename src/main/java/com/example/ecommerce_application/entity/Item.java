package com.example.ecommerce_application.entity;

import jakarta.persistence.*;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Item() {}

//    public Item(int product_id, String product_name, String description) {
//        this.product_id = product_id;
//        this.name = product_name;
//        this.description = description;
//    }
//
//    public Item(String product_name, String description) {
//        this.name = product_name;
//        this.description = description;
//    }
//
//    // defining getter and setters
//
//
//    public int getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(int product_id) {
//        this.product_id = product_id;
//    }
//
//    public String getProduct_name() {
//        return name;
//    }
//
//    public void setProduct_name(String product_name) {
//        this.name = product_name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    // define to string method
//
//    @Override
//    public String toString() {
//        return "item{" +
//                "product_id=" + product_id +
//                ", product_name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }


    public Item(int product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
