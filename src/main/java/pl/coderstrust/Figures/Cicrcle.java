package pl.coderstrust.Figures;

public class Cicrcle implements Figure {

    private double pi = 3.14159265359;
    private double r;
    private double surface;

    public double getSurface() {
        return surface;
    }

    public Cicrcle() {
        this.pi = pi;
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        surface=pi*r*r;
        return surface;
    }
}
