package SelectionSort;

public class SelectionSort {

    public static int[] selectionSorting(int[] numbersSorted) {
        for (int i = 0; i < numbersSorted.length-1; i++) {
            int highestPosition = numbersSorted.length-1;
            for (int j = numbersSorted.length-1; j >= i; j--) {
                if (numbersSorted[ j ] > numbersSorted[ highestPosition ]) {
                    highestPosition = j;
                    }
                    int temp = numbersSorted[highestPosition];
                    numbersSorted[highestPosition] = numbersSorted[ i ];
                    numbersSorted[ i ] = temp;
                }

            }
        return numbersSorted;
        }


    }



