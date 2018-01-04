package pl.coderstrust.Figures;

public class Square extends Rectangle implements Calculable {

    private double surface;
    double a;

    public Square(double a) {
        super(a);
        b=a;
    }

    public Square() {
    }

    public Square(double a, double b) {
        super(a,1);
    }
}