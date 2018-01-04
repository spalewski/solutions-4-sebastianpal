package pl.coderstrust.letsSort;

public class CollectionsSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new CollectionsSort();
    }
}