package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

public class CicrcleTest {

    @Test
    public void calculateArea() {
        Calculable circle = new Cicrcle(10);
        double given = circle.calculateArea();
        double expected = 314.15926535899996;

        Assert.assertEquals(expected, given, 0.001);
    }
}