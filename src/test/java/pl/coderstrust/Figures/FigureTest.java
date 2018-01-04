package pl.coderstrust.Figures;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public abstract class FigureTest {

    public abstract calculateFigures getFigure();

    @Test
    public void calculateArea() {

        int a = 12;
        int b = 20;
        int r = 40;
        List <Object> figures = new ArrayList<Object>()

        figures = getFigure().calculateArea(a, b, r);


    }
}
