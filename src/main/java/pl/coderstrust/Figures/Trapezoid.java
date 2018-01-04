package pl.coderstrust.Figures;

public class Trapezoid implements Figure {

    double a;
    double b;
    double height;
    double surface;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        surface=((a+b)*height)*0.5;
        return surface;
    }
}
