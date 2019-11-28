package com.generics;

public class MaximumNuber {
    public Integer findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }if(thirdNumber.compareTo(maxNumber)>0){
            maxNumber =  thirdNumber;
        }
        return maxNumber;
    }
}
