package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

public class TrapezoidTest {

    @Test
    public void calculateArea() {
        Calculable trapezoid = new Trapezoid(2.4, 3.6, 2);
        double given = trapezoid.calculateArea();
        double expected = 6;

        Assert.assertEquals(expected,given, 0.001);
    }
}