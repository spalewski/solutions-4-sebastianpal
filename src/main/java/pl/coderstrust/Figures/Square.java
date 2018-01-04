package pl.coderstrust.figures;

public class Square extends Rectangle implements Calculable {

    double surface;

    public Square(double a) {
        super(a);
        b=a;
    }

    public Square() {
    }
}