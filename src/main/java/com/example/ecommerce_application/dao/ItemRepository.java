package com.example.ecommerce_application.dao;

import com.example.ecommerce_application.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {

    public List<Item> findAllByOrderByNameAsc();
}
