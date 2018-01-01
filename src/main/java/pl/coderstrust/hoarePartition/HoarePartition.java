package pl.coderstrust.hoarePartition;

public class HoarePartition {

    public static int[] horaeSorter(int[] array, int pivotPosition) {
        int pivot = array[ pivotPosition ];

        int pivotValue = array[ pivotPosition ];
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (array[ i ] < pivotValue) {
                i++;
            }
            while (array[ j ] > pivotValue) {
                j--;
            }
            if (i <= j) {
                int temp = array[ i ];
                array[ i ] = array[ j ];
                array[ j ] = temp;
            }
        }
        return array;
    }
}