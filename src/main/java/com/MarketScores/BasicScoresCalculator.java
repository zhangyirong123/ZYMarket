package com.MarketScores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicScoresCalculator implements ScoresCalculator {
    List<Goods> sales = new ArrayList<>(Arrays.asList(new Goods("apple"), new Goods("milk")));

    @Override
    public int ScoresCalculator(ConsumeRecord consumeRecord) {
        int max = 1000;
        if (consumeRecord.getPrice() > max) {
            return max;
        }
        return consumeRecord.getPrice();
    }
}
