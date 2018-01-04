package pl.coderstrust.Figures;

public class Trapezoid implements Figure {

    private double a;
    private double b;
    private double height;
    double surface;

    public Trapezoid(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        surface=((a+b)*height)*0.5;
        return surface;
    }
}
