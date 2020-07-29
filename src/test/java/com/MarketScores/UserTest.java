package com.MarketScores;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void should_return_100Scores_when_consume_100RMB_given_user() {
        //given
        User user = new User();
        //when
        user.consume(100);
        //then
        Assert.assertEquals(100, user.getScores());
    }
}
