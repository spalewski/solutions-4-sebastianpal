package pl.coderstrust.figures;

public class Cicrcle implements Calculable {

    double pi = 3.14159265359;
    double r;
    double surface;

    public Cicrcle(double r) {
        this.pi = pi;
        this.r = r;
    }

    @Override
    public double calculateArea() {
        surface=pi*r*r;
        return surface;
    }
}