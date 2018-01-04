package pl.coderstrust.Figures;

import org.junit.Test;

import java.io.IOException;


    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() throws IOException {

        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] result = getSortingMethod().sort(given);

        assertArrayEquals(expected, result);
        assertEquals(expected.length, getSortingMethod().sort(given).length);
    }


public abstract class FigureTest {

    public abstract calculateFigures getSortingMethod();

    @Test
    public void calculateArea() {

        int a = 12;
        int b = 20;
        int r = 40;

       Figure Trapezoid = new Trapezoid();


    }
}