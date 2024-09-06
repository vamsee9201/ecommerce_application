package com.example.ecommerce_application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class items {

    @Id
    @GeneratedValue
    private Long id;
    //test
    private String Name;

    protected items() {}

    public items(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "items{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
