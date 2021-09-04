package com.example.demo.storage;

import com.example.demo.model.Card;
import com.example.demo.model.Denomination;
import com.example.demo.model.Suit;

import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck.add(new Card(Suit.CLUB , Denomination.TWO , 2 , "/image/C2.png"));
    }

}
