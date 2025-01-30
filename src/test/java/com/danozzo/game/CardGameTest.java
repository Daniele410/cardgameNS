package com.danozzo.game;

import com.danozzo.model.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {
    private CardGame game;

    @BeforeEach
    void setGame() {
        game = new CardGame();
    }

    @Test
    void testGameHasFourPlayers() {
        //When
        int playerCount = game.getPlayers().size();

        //Then
        assertEquals(4, playerCount);
    }

    @Test
    void testCardsAreDistributedEvenly() {
        //Given
        List<Player> players;
        int totalCards = 0;

        //When
        players = game.getPlayers();
        for (Player player : players) {
            totalCards += player.getCardCount();
        }

        //Then
        for (Player player : game.getPlayers()) {
            assertEquals(13, player.getCardCount());
        }
        assertEquals(52, totalCards);
    }

    @Test
    void testPlayRound() {
        //Given
        int initialCardCount;

        //When
        initialCardCount = game.getPlayers().get(0).getCardCount();
        game.playRound();
        int newCardCount = game.getPlayers().get(0).getCardCount();

        //Then
        assertTrue(newCardCount < initialCardCount, "Player should have one less card after playing a round");
    }

    @Test
    void testDeckIsShuffled() {
        // Given
        Deck originalDeck = new Deck();
        List<Card> originalCards = originalDeck.getCards();

        // When
        game = new CardGame();
        List<Card> shuffledCards = game.getDeck().getCards();

        // Then
        assertNotEquals(originalCards, shuffledCards, "Deck should be shuffled.");
    }

}