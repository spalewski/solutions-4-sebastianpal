package SelectionSort;

import java.util.Arrays;

public class Main {


    public static int[] sorting(int[] numbersSorted) {
        for (int i = 0; i < numbersSorted.length; i++) {
            int lowestPosition = i;
            for (int j = 0; j < numbersSorted.length; j++) {
                if (numbersSorted[ j ] > numbersSorted[ lowestPosition ]) {
                    lowestPosition = j;
                    if (lowestPosition != i) {
                        int numberToMove = numbersSorted[ i ];
                        numbersSorted[ i ] = numbersSorted[ lowestPosition ];
                        numbersSorted[ lowestPosition ] = numberToMove;
                    }


                }

            }

        }

        return numbersSorted;

    }


    public static void main(String[] args) {

        int[] nums = {2135, 4000, 3, 89, 67, 55, 199, 10};
        int[] sortedNums = sorting(nums);

        System.out.println(Arrays.toString(sortedNums));

    }
}
