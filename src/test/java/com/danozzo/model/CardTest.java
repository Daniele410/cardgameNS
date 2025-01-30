package com.danozzo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testCardCreation(){
        //Given
        Card card = new Card(Rank.ACE, Suit.SPADES);

        //When
        Rank rank = card.getRank();

        //Then
        assertEquals(Rank.ACE, rank);
    }

    @Test
    void testCardToString(){
        //Given
        Card card1 = new Card(Rank.KING, Suit.CLUBS);

        //When
        String cardString = card1.toString();

        //Then
        assertEquals("Roi de trèfle", cardString);
    }

    @Test
    void testCardComparison(){
        //Given
        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.TWO, Suit.SPADES);

        //When
        int comparison = card1.compareTo(card2);

        //Then
        assertTrue(comparison > 0);
    }

}