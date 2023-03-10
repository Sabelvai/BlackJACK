package com.example.demo.service;

import com.example.demo.model.Board;
import com.example.demo.model.Card;
import com.example.demo.storage.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    Deck originalDeck;

    Board board = new Board();

    @PostConstruct
    void init(){
        createNewGame();
    }

    public int getGamerScore(){
        int score = 0;
        for (int i = 0; i < board.getGamerCards().size(); i++) {
            score += board.getGamerCards().get(i).getValue();
        }
        return score;
    }

    public int getComputerScore(){
        return board.getDealerCards().stream()
                .mapToInt(Card::getValue).sum();
    }

    public void shufflerDeck(){
        Collections.shuffle(board.getDeck());
    }

    public String createMessage(){
        board.setMessage("player score" + this.getGamerScore()
                + "dealer score" + this.getComputerScore()
                + board.isTurn() + "turn");
        return board.getMessage();
    }

    public Board getBoard() {
        return board;
    }

    public void createNewGame(){
        this.board = new Board();
        board.setDealerCards(new ArrayList<>());
        board.setGamerCards(new ArrayList<>());
        board.setDeck(originalDeck.getDeck());
    }


}
