package pl.coderstrust.letsSort;

public class BubbleSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i <= array.length; ++i) {
            for (int j = 1; j < array.length; j++) {
                if (array[ j - 1 ] > array[ j ]) {
                    int moveNumber = array[ j - 1 ];
                    array[ j - 1 ] = array[ j ];
                    array[ j ] = moveNumber;
                }
            }
        }
        return array;
    }
}