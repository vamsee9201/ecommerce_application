package com.example.ecommerce_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {
    @GetMapping("/items")
    public String items(Model model) {
        model.addAttribute("placeholder","items to be displayed");
        return "items";
    }

    // Next step is to populate items and details on the database and use JPA to retrieve them



}
