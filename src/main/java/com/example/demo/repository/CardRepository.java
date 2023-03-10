package com.example.demo.repository;

import com.example.demo.model.Card;
import com.example.demo.storage.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository {
    @Autowired
    Deck deck;

    public List<Card> getDeck() {
        return deck.getDeck();
    }
}
