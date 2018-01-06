package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldCalculateRectangleArea() {

        Calculable rectangle = new Rectangle(20,30);
        double given = rectangle.calculateArea();
        double expected = 600;

        Assert.assertEquals(expected,given, 0.001);
    }
}