package com.MarketScores;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {
    @Test
    public void should_return_100_when_cosume_given_apple_100() {

        //when
        //given
        Consumer consumer = new Consumer();
        Goods apple = new Goods("apple");
        consumer.consume(apple, 100);
        ScoresCalculator calculator = new ScoresCalculator();
        int result = calculator.calculateScores(consumer.getConsumeRecords());
        //then

        Assert.assertEquals(100, result);
    }

}
