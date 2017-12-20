package pl.coderstrust.sorting.BubbleSort;

public class BubbleSort {

    public static int[] bubbleSorting(int[] numbersSorted) {
        for (int i = 0; i <= numbersSorted.length; ++i) {
            for (int j = 1; j < numbersSorted.length; j++) {
                if (numbersSorted[ j - 1 ] < numbersSorted[ j ]) {
                    int moveNumber = numbersSorted[ j - 1 ];
                    numbersSorted[ j - 1 ] = numbersSorted[ j ];
                    numbersSorted[ j ] = moveNumber;
                }
            }
        }
        return numbersSorted;
    }
}