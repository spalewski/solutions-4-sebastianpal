package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void calculateArea() {
        Calculable squre = new Square(20);
        double given = squre.calculateArea();
        double expected = 400;

        Assert.assertEquals(expected,given,0.001);
    }
}