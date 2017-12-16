package com.company;

public class BubbleSort {

    public static int[] bubbleSorting(int[] numbersSorted) {
        for (int i = 0; i < numbersSorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbersSorted[ j - 1 ] > numbersSorted[ j ]) {
                    int moveNumber = numbersSorted[ j ];
                    numbersSorted[ j ] = numbersSorted[ j - 1 ];
                    numbersSorted[ j - 1 ] = moveNumber;

                }

            }

        }

        return numbersSorted;

    }

}
