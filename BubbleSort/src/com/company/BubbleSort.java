package com.company;

public class BubbleSort {

    public static int[] bubbleSorting(int[] numbersSorted) {
        for (int i = 0; i < numbersSorted.length - 1; i++) {

            if (numbersSorted[ i + 1 ] < numbersSorted[ i ]) {
                int moveNumber = numbersSorted[ i ];
                numbersSorted[ i ] = numbersSorted[ i + 1 ];
                numbersSorted[ i + 1 ] = moveNumber;

            }
        }
        return numbersSorted;
    }
}
