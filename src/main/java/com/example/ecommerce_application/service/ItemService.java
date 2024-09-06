package com.example.ecommerce_application.service;

import com.example.ecommerce_application.entity.Item;
import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item findById();

    void save(Item theItem);

    void deleteById(Item theItem);
}
