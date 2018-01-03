
package pl.coderstrust.letsSort;

public class QuickSort implements SortingMethod {

    private int array[];
    private int length;

    @Override
    public int[] sort(int[] array) {

        if (array == null || array.length == 0) {

        }
        this.array = array;
        length = array.length;
        quickSort(0, length - 1);
        return array;
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[ lowerIndex + (higherIndex - lowerIndex) / 2 ];

        while (i <= j) {
            while (array[ i ] < pivot) {
                i++;
            }
            while (array[ j ] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = temp;
    }
}