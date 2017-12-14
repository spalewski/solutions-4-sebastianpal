package com.company;

import java.util.Arrays;

public class Main {


    public static int[] sorting(int[] numbersSorted) {
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


    public static void main(String[] args) {

        int[] nums = {2135, 3, 67, 89, 55, 199};
        int[] sortedNums = sorting(nums);

        System.out.println(Arrays.toString(sortedNums));

    }
}
