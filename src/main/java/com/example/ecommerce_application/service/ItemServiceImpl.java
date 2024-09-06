package com.example.ecommerce_application.service;

import com.example.ecommerce_application.dao.ItemRepository;
import com.example.ecommerce_application.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{
    public ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository theItemRepository) {
        itemRepository = theItemRepository;
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Item findById(int theId) {
        Optional<Item> result = itemRepository.findById(theId);
        Item theItem = null;

        if(result.isPresent()) {
            theItem = result.get();
        }
        else {
            throw new RuntimeException("did not find item id" + theId);
        }
        return theItem;
    }

    @Override
    public void save(Item theItem) {
    itemRepository.save(theItem);
    }

    @Override
    public void deleteById(int theId) {
        itemRepository.deleteById(theId);

    }
}
