package pl.coderstrust.Figures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public abstract class CalculableTest {

    public abstract Calculable getFigure();

    @Test
    public void shouldCalculateAllFigures() {
        double a = 12;
        double b = 20;
        double r = 40;
        double base = 10;
        double height = 100;
        Calculable circle = new Cicrcle(r);
        Calculable rectangle = new Rectangle(a,b);
        Calculable squre = new Square(b);
        Calculable trapezoid = new Trapezoid(a,b, height);
        Calculable triangle = new Triangle(base,height);

        List<Calculable> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(squre);
        figures.add(trapezoid);
        figures.add(triangle);

        for (int i = 0; i < figures.size(); i++) {
            {
                System.out.println((figures.get(i).calculateArea()));
            }
        }
    }
}