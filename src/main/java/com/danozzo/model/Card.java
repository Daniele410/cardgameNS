package com.danozzo.model;

public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rankToString(rank) + " de " + suitToString(suit);
    }

    private String rankToString(Rank rank) {
        switch (rank) {
            case TWO: return "2";
            case THREE: return "3";
            case FOUR: return "4";
            case FIVE: return "5";
            case SIX: return "6";
            case SEVEN: return "7";
            case EIGHT: return "8";
            case NINE: return "9";
            case TEN: return "10";
            case JACK: return "Valet";
            case QUEEN: return "Reine";
            case KING: return "Roi";
            case ACE: return "As";
            default: throw new IllegalArgumentException("Invalid rank");
        }
    }

    private String suitToString(Suit suit) {
        switch (suit) {
            case CLUBS: return "trèfle";
            case DIAMONDS: return "carreau";
            case HEARTS: return "cœur";
            case SPADES: return "pique";
            default: throw new IllegalArgumentException("Invalid suit");
        }
    }

    @Override
    public int compareTo(Card other) {
        return this.rank.ordinal() - other.rank.ordinal();
    }
}
