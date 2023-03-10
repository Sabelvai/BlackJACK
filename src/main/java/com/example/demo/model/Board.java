package com.example.demo.model;

import com.example.demo.storage.Deck;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import java.util.List;

public class Board {
    private List<Card> deck;
    private List<Card> gamerCards;
    private List<Card> dealerCards;
    private String message;
    private boolean turn;

    @Autowired
    Deck originalDeck;

    public Board() {
    }

    public Board(List<Card> deck, List<Card> gamerCards, List<Card> dealerCards, String message) {
        this.deck = new ArrayList<>(originalDeck.getDeck());
        this.gamerCards = gamerCards;
        this.dealerCards = dealerCards;
        this.message = message;
        this.turn = true;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getGamerCards() {
        return gamerCards;
    }

    public void setGamerCards(List<Card> gamerCards) {
        this.gamerCards = gamerCards;
    }

    public List<Card> getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(List<Card> dealerCards) {
        this.dealerCards = dealerCards;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "Board{" +
                "deck=" + deck +
                ", gamerCards=" + gamerCards +
                ", dealerCards=" + dealerCards +
                ", message='" + message + '\'' +
                '}';
    }

}
