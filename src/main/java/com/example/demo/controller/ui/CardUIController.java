package com.example.demo.controller.ui;

import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ui/card")
public class CardUIController {

    @Autowired
    CardService service;

    @GetMapping("/{id}")
    String getCardById(@RequestParam("id") int id){
        return "board";
    }

}
