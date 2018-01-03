package pl.coderstrust.letsSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortingTestBase {
    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() {

        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        long startTime = System.currentTimeMillis();

        int[] result = getSortingMethod().sort(given);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        assertArrayEquals(expected, result);
    }
}