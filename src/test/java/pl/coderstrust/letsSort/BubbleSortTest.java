package pl.coderstrust.letsSort;

public class BubbleSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new BubbleSort();
    }
}