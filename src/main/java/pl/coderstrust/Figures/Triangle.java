package pl.coderstrust.Figures;

public class Triangle implements Figure {

    public Triangle(double base, double height) {
        this.surface = surface;
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getSurface() {
        return surface;
    }

    public double getHeight() {
        return height;
    }

    double surface;
    double base ;
    double height;


    @Override
    public double calculateArea() {
        surface=0.5*base*height;
        return surface;
    }
}