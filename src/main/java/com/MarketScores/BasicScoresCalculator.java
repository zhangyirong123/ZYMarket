package com.MarketScores;

public class BasicScoresCalculator implements ScoresCalculator {
    @Override
    public int ScoresCalculator(ConsumeRecord consumeRecord) {
        return consumeRecord.getPrice();
    }
}
