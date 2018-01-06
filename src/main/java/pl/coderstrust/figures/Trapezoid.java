package pl.coderstrust.figures;

public class Trapezoid implements Calculable {

    double a;
    double b;
    double height;

    public Trapezoid(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((a+b)*height)*0.5;
    }
}