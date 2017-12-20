package pl.coderstrust.sorting.SelectionSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] nums = {2135, 4000, 3, 89, 67, 0, 55, 199, 10};
        int[] sortedNums = SelectionSort.selectionSorting(nums);

        System.out.println(Arrays.toString(sortedNums));

    }
}

