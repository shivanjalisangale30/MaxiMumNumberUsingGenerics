package com.generics;

import java.util.Arrays;

public class MaximumNuber<E extends Comparable<E>> {

    E maxNumber;
    E[] itemArray;

    public MaximumNuber(E... items) {
        E[] arrayItems = (E[]) new Comparable[items.length];
        for (E i : items) {
            arrayItems[i] = items;
            i++;
        }
        this.itemArray = arrayItems;
    }

    public E testMaximum() {

        Arrays.sort(itemArray);
        printMax(itemArray[itemArray.length-1)];
        return itemArray[itemArray.length-1);
    }

    private void printMax(E maxNumber) {
        System.out.println("Maximum :" + maxNumber);
    }


}
