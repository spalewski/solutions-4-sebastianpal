package pl.coderstrust.figures;

public class Trapezoid implements Calculable {

    double a;
    double b;
    double height;
    double surface;

    public Trapezoid(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    public Trapezoid() {
    }

    @Override
    public double calculateArea() {
        surface=((a+b)*height)*0.5;
        return surface;
    }
}
