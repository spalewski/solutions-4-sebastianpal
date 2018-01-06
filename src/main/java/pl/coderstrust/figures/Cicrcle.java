package pl.coderstrust.figures;

public class Cicrcle implements Calculable {

    double pi = 3.14159265359;
    double r;

    public Cicrcle(double r) {
        this.pi = pi;
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return pi*r*r;
    }
}