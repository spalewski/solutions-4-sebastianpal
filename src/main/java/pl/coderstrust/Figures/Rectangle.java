package pl.coderstrust.Figures;

public class Rectangle implements Figure {

    double surface;
    double a;
    double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        surface=a*b;
        return surface;
    }
}