package com.danozzo.game;

import com.danozzo.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    public String getName() {
        return name;
    }

    public int getCardCount() {
        return hand.size();
    }

}
