package com.MarketScores;

public class UnnecessaryScoresCalculator implements ScoresCalculator {

    @Override
    public int ScoresCalculator(ConsumeRecord consumeRecord) {
        int max = 1000;
        int result = 0;
        if (consumeRecord.getPrice() > max) {
            result = 1000 - consumeRecord.getPrice() + (consumeRecord.getPrice() - 1000) / 20;
        }
        return result;
    }
}
