package com.example.ecommerce_application.controller;

import com.example.ecommerce_application.entity.Item;
import com.example.ecommerce_application.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService theItemService) {itemService = theItemService;}

    @GetMapping("/list")
    public String ListItems(Model theModel) {
        List<Item> theItems = itemService.findAll();
        theModel.addAttribute("items",theItems);



        return "list-items";
    }







}
