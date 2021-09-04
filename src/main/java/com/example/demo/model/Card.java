package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Card {
    private Suit suit;
    private Denomination denomination;
    private int value;
    private String image;

    public Card(Suit suit, Denomination denomination, int value, String image) {
        this.suit = suit;
        this.denomination = denomination;
        this.value = value;
        this.image = image;
    }
}
