package com.MarketScores;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {
    @Test
    public void should_return_100_when_cosume_given_apple_100() {

        //when
        //given
        Cosnumer consumer = new Consumer();
        Goods apple = new Goods("apple");
        consumer.consume(apple, 100);
        Calculator calculator = new Calculator();
        int result = calculator.calculate(Consumer.getConsumeRecords());
        //then
        Assert.assertEquals(100, result);
    }

}
