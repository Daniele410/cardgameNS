package com.danozzo.game;

import com.danozzo.model.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    List<Player> players;
    private Deck deck;

    public CardGame() {
        deck = new Deck();
        players = new ArrayList<>();

        deck.printDeck();

        deck.shuffle();

        for (int i = 1; i <= 4; i++) {
            players.add(new Player("Player" + i));
        }
        distributeCards();
    }

    private void distributeCards() {
        while (deck.size() > 0) {
            for (Player player : players) {
                if (deck.size() > 0) {
                    player.receiveCard(deck.draw());
                }
            }
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void playRound() {
        List<Card> playedCards = new ArrayList<>();
        List<Player> potentialWinners = new ArrayList<>();
        Card highestCard = null;

        for (Player player : players) {
            Card playedCard = player.playCard();
            playedCards.add(playedCard);
            System.out.println(player.getName() + " played " + playedCard);

            if (highestCard == null || playedCard.compareTo(highestCard) > 0) {
                highestCard = playedCard;
                potentialWinners.clear();
                potentialWinners.add(player);
            } else if (playedCard.compareTo(highestCard) == 0) {
                potentialWinners.add(player);
            }
        }

        // Randomly select a winner from the potential winners
        Collections.shuffle(potentialWinners);
        Player winner = potentialWinners.get(0);

        System.out.println("Winner of the round: " + winner.getName());
        for (Card card : playedCards) {
            winner.receiveCard(card);
        }
    }


    public Deck getDeck() {
        return deck;
    }

    public List<Player> getPotentialWinners() {
        return players;
    }
}
