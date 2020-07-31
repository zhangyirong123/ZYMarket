package com.MarketScores;

public class CalculatePerRecord {
    public int calculatePerRecord(ConsumeRecord consumeRecord) {
        BasicScoresCalculator basicScoresCalculator = new BasicScoresCalculator();
        ExtraScoresCalculator extraScoresCalculator = new ExtraScoresCalculator();
        return basicScoresCalculator.ScoresCalculator(consumeRecord) + extraScoresCalculator.ScoresCalculator(consumeRecord);
    }
}
