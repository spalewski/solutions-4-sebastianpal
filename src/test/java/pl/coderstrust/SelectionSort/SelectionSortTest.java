package pl.coderstrust.SelectionSort;

        import org.junit.Assert;
        import pl.coderstrust.sorting.SelectionSort.SelectionSort;

public class SelectionSortTest {


    @org.junit.Test
    public void checkIfProperlySorted() {
        int[] nums = {2135, 4000, 3, 89, 67, 0, 55, 199, 10};
        int[] testNumbers = {4000, 2135, 199, 89, 67, 55, 10, 3, 0};
        int[] numbersFromMethod = SelectionSort.selectionSorting(nums);
        Assert.assertArrayEquals(testNumbers, numbersFromMethod);
    }
}