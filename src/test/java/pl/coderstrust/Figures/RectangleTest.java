package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void calculateArea() {

        Calculable rectangle = new Rectangle(20,30);
        double given = rectangle.calculateArea();
        double expected = 600;

        Assert.assertEquals(expected,given, 0.001);
    }
}