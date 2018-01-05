package pl.coderstrust.figures;

public class Triangle implements Calculable {

    double surface;
    double base ;
    double height;

    public Triangle(double base, double height) {
        this.surface = surface;
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public double calculateArea() {
        surface=0.5*base*height;
        return surface;
    }
}