package com.danozzo.game;

import com.danozzo.model.Card;
import com.danozzo.model.Rank;
import com.danozzo.model.Suit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
       cards = new ArrayList<>();
       for(Suit suit: Suit.values()){
           for(Rank rank: Rank.values()){
               cards.add(new Card(rank, suit));
           }
       }
       shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card draw(){
        return cards.isEmpty() ? null: cards.remove(0);
    }

    public int size(){
        return cards.size();
    }
}

