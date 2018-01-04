package pl.coderstrust.Figures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public abstract class FigureTest {

    public abstract FigureTest getFigure();

    @Test
    public void shouldCalculateAreaOfAllFigures() {
        Figure circle;
        double a = 12;
        double b = 20;
        double r = 40;
        List <Object> figures = new ArrayList<Object>();
        double result = getFigure().