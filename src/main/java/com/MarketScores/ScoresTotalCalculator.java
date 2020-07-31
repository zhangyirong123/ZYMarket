package com.MarketScores;

import java.util.List;

public class ScoresTotalCalculator {
    public int calculateScores(List<ConsumeRecord> consumeRecords) {
        int scores = 0;
        CalculatePerRecord calculatePerRecord = new CalculatePerRecord();
        for (ConsumeRecord consumeRecord : consumeRecords) {
            scores += calculatePerRecord.calculatePerRecord(consumeRecord);
        }
        return scores;
    }


}
