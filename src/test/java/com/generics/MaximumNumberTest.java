package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenThreeNumber_whenInteger_maximumNumber() {
        Integer firstNumber = 50;
        Integer secondNumber = 45;
        Integer thirdNumber = 40;
        MaximumNuber maximumNuber = new MaximumNuber(firstNumber,secondNumber,thirdNumber);
        Integer result = (Integer) maximumNuber.testMaximum();
        Assert.assertEquals(firstNumber, result);
    }

    @Test
    public void givenThreeNumber_whenFloat_maximumNumber() {
        Float firstNumber = 55.5f;
        Float secondNumber = 45.5f;
        Float thirdNumber = 65.5f;
        MaximumNuber maximumNuber = new MaximumNuber(firstNumber,secondNumber,thirdNumber);
        Float result = (Float) maximumNuber.testMaximum();
        Assert.assertEquals(thirdNumber,result);
    }

    @Test
    public void givenThreeString_whenString_maximumString() {
        String firstString = "Jyoti";
        String secondString = "Shivanjali";
        String thirdString = "Hiral";
        MaximumNuber maximumNuber = new MaximumNuber(firstString,secondString,thirdString);
        String result = (String) maximumNuber.testMaximum();
        Assert.assertEquals(secondString,result);
    }
}
