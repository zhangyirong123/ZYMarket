package com.MarketScores;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

    private List<ConsumeRecord> consumeRecords = new ArrayList<>();

    public List<ConsumeRecord> getConsumeRecords() {
        return consumeRecords;
    }

    public void consume(Goods goods, int price) {
        ConsumeRecord consumeRecord = new ConsumeRecord(goods.getName(), price);
        consumeRecords.add(consumeRecord);

    }
}
