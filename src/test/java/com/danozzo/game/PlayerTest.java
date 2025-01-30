package com.danozzo.game;

import com.danozzo.model.Card;
import com.danozzo.model.Rank;
import com.danozzo.model.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testPlayerInitialization(){
        //Given
        Player player = new Player("Alice");

        //When
        String name = player.getName();
        int cardCount = player.getCardCount();

        //Then
        assertEquals("Alice", name);
        assertEquals(0, cardCount);
    }

    @Test
    void testReceiveCard(){
        //Given
        Player player = new Player("Alice");
        Card card = new Card(Rank.ACE, Suit.SPADES);

        //When
        player.receiveCard(card);

        //Then
        assertEquals(1, player.getCardCount());
    }

    @Test
    void testPlayCard(){
        //Given
        Player player = new Player("Alice");
        Card card = new Card(Rank.ACE, Suit.SPADES);
        player.receiveCard(card);

        //When
        Card playedCard = player.playCard();

        //Then
        assertEquals(0, player.getCardCount());
        assertEquals(card, playedCard);
    }

    @Test
    void testPlayCardEmptyHand(){
        //Given
        Player player = new Player("Alice");

        //When
        Card playedCard = player.playCard();

        //Then
        assertEquals(0, player.getCardCount());
        assertNull(playedCard);
    }

}