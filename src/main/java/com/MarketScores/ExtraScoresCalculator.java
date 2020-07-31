package com.MarketScores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraScoresCalculator implements ScoresCalculator {
    List<Goods> sales = new ArrayList<>(Arrays.asList(new Goods("apple"), new Goods("milk")));

    @Override
    public int ScoresCalculator(ConsumeRecord consumeRecord) {
        for (Goods goods :
                sales) {
            if (goods.getName().equals(consumeRecord.getName())) {
                return consumeRecord.getPrice();
            }
        }
        return 0;

    }
}
