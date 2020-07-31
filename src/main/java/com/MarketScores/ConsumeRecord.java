package com.MarketScores;

public class ConsumeRecord {
    private String name;
    private int price;

    public ConsumeRecord(String name, int price) {

        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
