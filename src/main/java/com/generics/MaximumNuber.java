package com.generics;

public class MaximumNuber<E extends Comparable<E>> {
    public E findMaximum(E firstNumber, E secondNumber, E thirdNumber) {
        E maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }if(thirdNumber.compareTo(maxNumber)>0){
            maxNumber =  thirdNumber;
        }
        return maxNumber;
    }
}
