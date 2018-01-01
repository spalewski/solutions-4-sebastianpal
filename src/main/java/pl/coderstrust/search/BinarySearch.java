package pl.coderstrust.search;

public class BinarySearch {

    public static int search(int[] array, int element) {

        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (element < array[ mid ]) hi = mid - 1;
            else if (element > array[ mid ]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int element = 50;
        int position = search(arr, element);
        if (position >= 0) {
            System.out.println("Element " + element + " that you are looking for, is on: " + position + " position");
        } else System.out.println("Element " + element + " not found");
    }
}