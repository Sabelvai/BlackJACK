package com.example.demo.service;

import com.example.demo.model.Card;
import com.example.demo.model.Denomination;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService implements CardInterface{
    @Autowired
    CardRepository repository;

    @Override
    public Card getCardById(int id) {
        Card card = repository.getDeck().stream().filter(item->item.getId() == id)
                .findFirst().get();
        return card;
    }
    @Override
    public Denomination getDenominationById(int id){
        Card card = getCardById(id);
        Denomination denomination = card.getDenomination();
        return denomination;
    }
    @Override
    public int getValueById(int id){
        Card card = getCardById(id);
        int value = card.getValue();
        return value;
    }

}
