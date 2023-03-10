package com.example.demo.controller.ui;

import com.example.demo.model.Card;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/ui/board")
public class BoardUIController {

    @Autowired
    BoardService service;

    @GetMapping("/all")
    String getBoard(Model model){
        List<Card> cards = service.getBoard().getDeck();
        model.addAttribute("cards",cards);
        return "board";
    }

    @GetMapping("/all/shuffle")
    String getShuffle(Model model){
        List<Card> cards = service.getBoard().getDeck();
        Collections.shuffle(cards);
        model.addAttribute("cards",cards);
        return "board";
    }

    @GetMapping("/all/give/me")
    String getLastCard(Model model){
        List<Card> cards = service.getBoard().getDeck();
        List<Card> myCards = service.getBoard().getGamerCards();
        model.addAttribute("cards",cards);
        return "board";
    }
}
