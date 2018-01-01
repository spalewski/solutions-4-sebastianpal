package pl.coderstrust.search;

public class LinearSearch {

    public static int search(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[ i ] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int element = 30;
        int position = search(arr, element);
        if (position >= 0) {
            System.out.println("Element " + element + " that you are looking for, is on: " + position + " position");
        } else System.out.println("Element " + element + " not found");
    }
}