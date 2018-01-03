package pl.coderstrust.letsSort;

import java.util.Arrays;

public class CollectionsSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}