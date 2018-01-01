package pl.coderstrust.hoarePartition;

public class HoarePartition {

    public static int[] hoarePartitioning (int[] array, int pivotPosition) {
        int [] arraySorted = new int[array.length];
        int pivot = array[ pivotPosition ];
        int leftIndex = pivot - 1;
        int rightIndex = pivot + 1;

        while (leftIndex <= rightIndex) {
            while (array[ leftIndex ] < pivot) leftIndex++;
            while (array[ rightIndex ] > pivot) rightIndex--;

            if (leftIndex <= rightIndex) {
                int temp = array[leftIndex];
                array[leftIndex]=array[rightIndex];
                array[rightIndex]=temp;
                leftIndex++;
                rightIndex--;
            }
        }

        //But here the tricky thing: Why does this "if case" never execute?
    //    if (leftIndex - 1 > rightIndex)
       //     System.out.println("leftIndex - 1 > rightIndex");

        return array;
    }
}
