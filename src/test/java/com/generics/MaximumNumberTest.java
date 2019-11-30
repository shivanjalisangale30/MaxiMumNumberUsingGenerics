package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void givenThreeNumber_whenInteger_maximumNumber() {
        MaximumNuber maximumNuber = new MaximumNuber(50,45,40,55,25);
        Integer result = (Integer) maximumNuber.testMaximum();
        Assert.assertEquals(java.util.Optional.of(55), result);
    }

    @Test
    public void givenThreeNumber_whenFloat_maximumNumber() {
        MaximumNuber maximumNuber = new MaximumNuber(55.5f,45.5f,65.5f,50.0f,70.5f);
        Float result = (Float) maximumNuber.testMaximum();
        Assert.assertEquals(java.util.Optional.of(70.5f),result);
    }


    public void givenThreeString_whenString_maximumString() {
        MaximumNuber maximumNuber = new MaximumNuber("Aditi","Shivanjali","hiral","Jyoti");
        String result = (String) maximumNuber.testMaximum();
        Assert.assertEquals("Shivanjali",result);
    }

}
