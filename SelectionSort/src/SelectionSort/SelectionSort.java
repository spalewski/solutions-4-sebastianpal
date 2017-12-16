package SelectionSort;

public class SelectionSort {

    public static int[] selectionSorting(int[] numbersSorted) {
        for (int i = 0; i < numbersSorted.length; i++) {
            int highestPosition = i;
            for (int j = numbersSorted.length - 1; j >= i; j--) {
                if (numbersSorted[ j ] > numbersSorted[ highestPosition ]) {
                    int numberToMove = numbersSorted[ j ];
                    numbersSorted[ j ] = numbersSorted[ highestPosition ];
                    numbersSorted[ highestPosition ] = numberToMove;
                }


            }

        }
        return numbersSorted;

    }

}

