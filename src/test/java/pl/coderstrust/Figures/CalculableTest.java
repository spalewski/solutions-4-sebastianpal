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
        Calculable circle = new Cicrcle();
        Calculable rectangle = new Rectangle();
        Calculable squre = new Square();
        Calculable trapezoid = new Trapezoid();
        Calculable triangle = new Triangle();
        
        List<Calculable> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(squre);
        figures.add(trapezoid);
        figures.add(triangle);

        for (Calculable c:
             figures); {
                 a=12; b=12; r=100; base=20;
            
        }
    }
}
