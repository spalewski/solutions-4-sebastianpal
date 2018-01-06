package pl.coderstrust.figures;

public class Triangle implements Calculable {

    double base ;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }
}