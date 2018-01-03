package pl.coderstrust.letsSort;

public class SelectionSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int highestPosition = array.length - 1;
            for (int j = array.length - 1; j >= i; j--) {
                if (array[ j ] < array[ highestPosition ]) {
                    highestPosition = j;
                }
                int temp = array[ highestPosition ];
                array[ highestPosition ] = array[ i ];
                array[ i ] = temp;
            }
        }
        return array;
    }

    @Override
    public void getName() {
        getClass().getName();
    }
}