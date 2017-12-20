package pl.coderstrust.sorting.BubbleSort;

import org.junit.Assert;

public class BubbleSortTest {

    @org.junit.Test
    public void checkIfProperlySorted() {

        int[] nums = {2135, 3, 67, 89, 55, 199, 5000, 10, 900};
        int[] testNumbers = {5000, 2135, 900, 199, 89, 67, 55, 10, 3};
        int[] numbersFromMethod = BubbleSort.bubbleSorting(nums);
        Assert.assertArrayEquals(numbersFromMethod,testNumbers);

    }
}
