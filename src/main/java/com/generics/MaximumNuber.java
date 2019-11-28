package com.generics;

public class MaximumNuber<E extends Comparable<E>> {

    E firstNumber ;
    E secondNumber;
    E thirdNumber;

    public MaximumNuber(E firstNumber, E secondNumber, E thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public E testMaximum() {
        E maxNumber = this.firstNumber;
        if (this.secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = this.secondNumber;
        }if(this.thirdNumber.compareTo(maxNumber)>0){
            maxNumber =  this.thirdNumber;
        }
        printMax(maxNumber);
        return maxNumber;
    }

    private void printMax(E maxNumber) {
        System.out.println("Maximum :" +maxNumber);
    }
}
