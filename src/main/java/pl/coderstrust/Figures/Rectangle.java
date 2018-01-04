package pl.coderstrust.Figures;

public class Rectangle implements Calculable {

    double surface;
    double a;
    double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        surface=a*b;
        return surface;
    }
}