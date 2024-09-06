package com.example.ecommerce_application.service;

import com.example.ecommerce_application.entity.Item;
import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item findById(int theId);

    void save(Item theItem);

    void deleteById(int theId);
}
