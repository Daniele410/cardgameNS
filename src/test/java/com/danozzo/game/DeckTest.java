package com.danozzo.game;

import com.danozzo.model.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void testDeckInitialization(){
        //Given
        Deck deck = new Deck();

        //When
        int deckSize = deck.size();

        //Then
        assertEquals(52, deckSize);
    }

    @Test
    void testDrawCard(){
        //Given
        Deck deck = new Deck();

        //When
        Card drawnCard = deck.draw();

        //Then
        assertNotNull(drawnCard);
        assertEquals(51,deck.size());
    }

    @Test
    void testDrawAllCards(){
        //Given
        Deck deck = new Deck();

        //When
        for(int i = 0; i < 52; i++){
            deck.draw();
        }

        //Then
        assertEquals(0, deck.size());
    }

    @Test
    void testDrawEmptyDeck(){
        //Given
        Deck deck = new Deck();

        //When
        for(int i = 0; i < 52; i++){
            deck.draw();
        }

        //Then
        assertNull(deck.draw());
    }

    @Test
    void testShuffle(){
        //Given
        Deck deck = new Deck();
        Card firstCard = deck.draw();
        deck.shuffle();
        Card shuffledFirstCard = deck.draw();

        //Then
        assertNotEquals(firstCard, shuffledFirstCard);
    }

    @Test
    void testPrintDeck(){
        //Given
        Deck deck = new Deck();

        //When
        deck.printDeck();

        //Then
        assertEquals(52, deck.size());
    }

}