package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenThreeNumber_whenInteger_maximumNumber() {
        MaximumNuber maximumNuber = new MaximumNuber();
        Integer firstNumber = 50;
        Integer secondNumber = 45;
        Integer thirdNumber = 40;
        Integer result = maximumNuber.findMaximumNumber(firstNumber,secondNumber,thirdNumber);
        Assert.assertEquals(firstNumber,result);
    }

    @Test
    public void givenThreeNumber_whenFloat_maximumNumber() {
        MaximumNuber maximumNuber = new MaximumNuber();
        Float firstNumber = 55.5f;
        Float secondNumber = 45.5f;
        Float thirdNumber = 65.5f;
        Float result = maximumNuber.findMaximumNumber(firstNumber, secondNumber, thirdNumber);
        Assert.assertEquals(thirdNumber,result);
    }
}
