package pl.coderstrust.Figures;

public class Cicrcle implements Figure {

    private double pi = 3.14159265359;
    private double r;
    private double surface;

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
