package pl.coderstrust.Figures;

public class Square extends Rectangle implements Figure {

    private double surface;
    double a;

    public Square(double a) {
        super(a);
        b=a;
    }
    public Square(double a, double b) {
        super(a,1);
    }
}