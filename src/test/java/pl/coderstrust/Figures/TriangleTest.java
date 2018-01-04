package pl.coderstrust.Figures;

        import org.junit.Assert;
        import org.junit.Test;

public class TriangleTest {
    @Test
    public void calculateArea() {
        Calculable triangle = new Triangle(2.4, 3);
        double given = triangle.calculateArea();
        double expected = 3.6;

        Assert.assertEquals(expected, given, 0.001);
    }
}