package pl.coderstrust.letsSort;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public abstract class SortingTestBase {
    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() throws IOException {

        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] result = getSortingMethod().sort(given);

        assertArrayEquals(expected, result);
        assertEquals(expected.length, getSortingMethod().sort(given).length);
    }

    @Test
    public void methodsEfficiencyTest() throws IOException {
        int[] small = new Random().ints(1000, 0, 100).toArray();
        int[] medium = new Random().ints(10000, 0, 1000000).toArray();
        int[] large = new Random().ints(100000, 0, 100000000).toArray();
        int[] empty = {};
        String methodName = getSortingMethod().getName();

        BufferedWriter writeResults = new BufferedWriter(new FileWriter("src" + File.separator + "test" + File.separator + "resources" + File.separator + "lets_sort_test.txt", true));

        long startTime1 = System.currentTimeMillis();
        int[] result1 = getSortingMethod().sort(small);
        long endTime1 = System.currentTimeMillis();
        System.out.println("For " + methodName + " and " + small.length + " elements array , sorting took " + (endTime1 - startTime1) + " ms");
        writeResults.write("For " + methodName + " and " + small.length + " elements array , sorting took " + (endTime1 - startTime1) + " ms");
        writeResults.newLine();

        long startTime2 = System.currentTimeMillis();
        int[] result2 = getSortingMethod().sort(medium);
        long endTime2 = System.currentTimeMillis();
        System.out.println("For " + methodName + " and " + medium.length + " elements array , sorting took " + (endTime2 - startTime2) + " ms");
        writeResults.write("For " + methodName + " and " + medium.length + " elements array , sorting took " + (endTime2 - startTime2) + " ms");
        writeResults.newLine();

        long startTime3 = System.currentTimeMillis();
        int[] result3 = getSortingMethod().sort(large);
        long endTime3 = System.currentTimeMillis();
        System.out.println("For " + methodName + " and " + large.length + " elements array , sorting took " + (endTime3 - startTime3) + " ms");
        writeResults.write("For " + methodName + " and " + empty.length + " elements array , sorting took " + (endTime3 - startTime3) + " ms");
        writeResults.newLine();

        long startTime4 = System.currentTimeMillis();
        int[] result4 = getSortingMethod().sort(empty);
        long endTime4 = System.currentTimeMillis();
        System.out.println("For " + methodName + " and " + empty.length + " elements array , sorting took " + (endTime4 - startTime4) + " ms");
        writeResults.write("For " + methodName + " and " + empty.length + " elements array , sorting took " + (endTime4 - startTime4) + " ms");
        writeResults.newLine();

        writeResults.close();
    }
}