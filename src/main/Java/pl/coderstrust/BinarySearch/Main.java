package pl.coderstrust.BinarySearch;

public class Main {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int element = 50;
        int positionBinary = BinarySearch.search(arr, element);
        int positionLinear = LinearSearch.search(arr, element);
        if (positionBinary >= 0) {
            System.out.println("BinarySearch \nNumber " + element + " that you are looking for, is on: " + positionBinary + " position");
        } else System.out.println("BinarySearch \nNumber " + element + " not found");
        if (positionLinear >= 0) {
            System.out.println("LinearSearch \nNumber " + element + " that you are looking for, is on: " + positionBinary + " position");
        } else System.out.println("LinearSearch \nNumber " + element + " not found");
    }
}