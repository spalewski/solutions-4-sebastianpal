package pl.coderstrust.letsSort;

public class QuickSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new QuickSort();
    }
}