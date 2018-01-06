package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CalculableTest {

    @Test
    public void shouldCalculateAllFiguresArea() {
        double a = 12;
        double b = 20;
        double r = 40;
        double base = 10;
        double height = 100;
        Calculable circle = new Cicrcle(r);
        Calculable rectangle = new Rectangle(a, b);
        Calculable squre = new Square(b);
        Calculable trapezoid = new Trapezoid(a, b, height);
        Calculable triangle = new Triangle(base, height);

        List<Calculable> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(squre);
        figures.add(trapezoid);
        figures.add(triangle);

        List<Double> expected = new ArrayList<Double>();
        expected.add(5026.548245743999);
        expected.add(240.0);
        expected.add(400.0);
        expected.add(1600.0);
        expected.add(500.0);

        for (int i = 0; i < figures.size(); i++) {
            {
                Assert.assertEquals(expected.get(i), figures.get(i).calculateArea(), 0.001);
                System.out.println((figures.get(i).calculateArea())); //to print calculations
            }
        }
    }
}