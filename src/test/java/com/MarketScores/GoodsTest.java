package com.MarketScores;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {
    @Test
    public void should_return_100_when_cosume_given_xiyiye_100() {

        //given
        Consumer consumer = new Consumer();
        Goods apple = new Goods("xiyiye");
        //when
        consumer.consume(apple, 100);
        ScoresTotalCalculator calculator = new ScoresTotalCalculator();
        int result = calculator.calculateScores(consumer.getConsumeRecords());
        //then

        Assert.assertEquals(100, result);
    }
    @Test
    public void should_return_200_when_cosume_given_apple_100() {

        //given
        Consumer consumer = new Consumer();
        Goods apple = new Goods("apple");
        //when
        consumer.consume(apple, 100);
        ScoresTotalCalculator calculator = new ScoresTotalCalculator();
        int result = calculator.calculateScores(consumer.getConsumeRecords());
        //then

        Assert.assertEquals(200, result);
    }
    @Test
    public void should_return_1067_when_cosume_given_frige_2350() {

        //given
        Consumer consumer = new Consumer();
        Goods apple = new Goods("frige");
        //when
        consumer.consume(apple, 2350);
        ScoresTotalCalculator calculator = new ScoresTotalCalculator();
        int result = calculator.calculateScores(consumer.getConsumeRecords());
        //then

        Assert.assertEquals(1067, result);
    }
}
