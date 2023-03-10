package com.example.demo.controller.api;

import com.example.demo.model.Card;
import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/card")
@RestController
public class CardRestController {
    @Autowired
    CardService service;


    @GetMapping("/{id}")
    Card getCardById(@PathVariable("id") int id){
        Card card = service.getCardById(id);
        return card;
    }
}
