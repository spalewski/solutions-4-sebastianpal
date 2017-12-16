package SelectionSort;

public class SelectionSort {

    public static int[] selectionSorting(int[] numbersSorted) {
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
}
