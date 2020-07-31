package com.MarketScores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatePerRecord {
    public int calculatePerRecord(ConsumeRecord consumeRecord) {
//        BasicScoresCalculator basicScoresCalculator = new BasicScoresCalculator();
//        ExtraScoresCalculator extraScoresCalculator = new ExtraScoresCalculator();
//        return basicScoresCalculator.ScoresCalculator(consumeRecord) + extraScoresCalculator.ScoresCalculator(consumeRecord);
        int result = 0;
        List<ScoresCalculator> scoresCalculators = new ArrayList<>(Arrays.asList(new BasicScoresCalculator(), new ExtraScoresCalculator()));
        for (ScoresCalculator scoresCalculator : scoresCalculators
        ) {
            result += scoresCalculator.ScoresCalculator(consumeRecord);
        }
        return result;
    }
}
