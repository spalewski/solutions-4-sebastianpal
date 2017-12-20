package pl.coderstrust.sorting.BubbleSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] nums = {2135, 3, 67, 89, 55, 199, 5000, 10, 900};
        int[] sortedNums = BubbleSort.bubbleSorting(nums);

        System.out.println(Arrays.toString(sortedNums));

    }
}

