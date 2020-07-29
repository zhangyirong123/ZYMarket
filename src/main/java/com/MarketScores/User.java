package com.MarketScores;

public class User {

    private int scores;

    public int getScores() {
        return scores;
    }

    public void consume(double spend) {
        this.scores = (int) Math.floor(spend);
    }
}
