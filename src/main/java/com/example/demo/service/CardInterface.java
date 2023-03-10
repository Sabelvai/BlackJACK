package com.example.demo.service;

import com.example.demo.model.Card;
import com.example.demo.model.Denomination;

public interface CardInterface {
    Card getCardById(int id);

    Denomination getDenominationById(int id);

    int getValueById(int id);
}
