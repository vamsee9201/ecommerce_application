package com.example.ecommerce_application.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ecommerce_db")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "name")
    private String product_name;

    @Column(name = "description")
    private String description;

    public item() {}

    public item(int product_id, String product_name, String description) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.description = description;
    }

    public item(String product_name, String description) {
        this.product_name = product_name;
        this.description = description;
    }

    // defining getter and setters


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // define to string method

    @Override
    public String toString() {
        return "item{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
