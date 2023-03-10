package com.example.demo.model;


public class Card {
    private int id;
    private Suit suit;
    private Denomination denomination;
    private int value;
    private String image;


    public int getId() {
        return id;
    }

    public Card() {
    }

    public Card(int id, Suit suit, Denomination denomination, int value, String image) {
        this.id = id;
        this.suit = suit;
        this.denomination = denomination;
        this.value = value;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Suit getSuitById(int id){
        int s=id/ 13;
        if(s==0) return Suit.CLUB;
        if(s==1) return Suit.HEART;
        if(s==2) return Suit.SPADE;
        if(s==3) return Suit.DIAMOND;
        return null;
    }
}
