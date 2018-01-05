package pl.coderstrust.figures;

public class Rectangle implements Calculable {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
}