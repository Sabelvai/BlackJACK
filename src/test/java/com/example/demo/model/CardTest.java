package com.example.demo.model;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CardTest {

    @org.junit.Test
    public void whenId34ThenSpade() {
        Suit suitExpected = Suit.SPADE;
        Card card = new Card();
        Suit suitActual = card.getSuitById(34);
        Assert.assertEquals(suitExpected,suitActual);
    }
    @org.junit.Test
    public void whenId0ThenClub() {
        Suit suitExpected = Suit.CLUB;
        Card card = new Card();
        Suit suitActual = card.getSuitById(0);
        Assert.assertEquals(suitExpected,suitActual);
    }
    @org.junit.Test
    public void whenId12ThenClub() {
        Suit suitExpected = Suit.CLUB;
        Card card = new Card();
        Suit suitActual = card.getSuitById(12);
        Assert.assertEquals(suitExpected,suitActual);
    }
    @org.junit.Test
    public void whenId13ThenHeart() {
        Suit suitExpected = Suit.HEART;
        Card card = new Card();
        Suit suitActual = card.getSuitById(13);
        Assert.assertEquals(suitExpected,suitActual);
    }

    @org.junit.Test
    public void whenId25ThenHeart() {
        Suit suitExpected = Suit.HEART;
        Card card = new Card();
        Suit suitActual = card.getSuitById(25);
        Assert.assertEquals(suitExpected,suitActual);
    }

    @org.junit.Test
    public void whenId26ThenSpade() {
        Suit suitExpected = Suit.SPADE;
        Card card = new Card();
        Suit suitActual = card.getSuitById(26);
        Assert.assertEquals(suitExpected,suitActual);
    }

    @org.junit.Test
    public void whenId38ThenSpade() {
        Suit suitExpected = Suit.SPADE;
        Card card = new Card();
        Suit suitActual = card.getSuitById(38);
        Assert.assertEquals(suitExpected,suitActual);
    }

    @org.junit.Test
    public void whenId39ThenDiamond() {
        Suit suitExpected = Suit.DIAMOND;
        Card card = new Card();
        Suit suitActual = card.getSuitById(39);
        Assert.assertEquals(suitExpected,suitActual);
    }

    @org.junit.Test
    public void whenId51ThenSpade() {
        Suit suitExpected = Suit.DIAMOND;
        Card card = new Card();
        Suit suitActual = card.getSuitById(51);
        Assert.assertEquals(suitExpected,suitActual);
    }

}