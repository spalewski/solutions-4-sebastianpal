package pl.coderstrust.Figures;

public class Main {

    public static void main(String[] args) {
        Cicrcle circle = new Cicrcle();
        circle.setR(20);circle.calculateArea();
        System.out.println(circle.getSurface());

        Figure trangle1 = new Triangle(21,23);
        trangle1.calculateArea();
        System.out.println(trangle1.calculateArea());

        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setA(4);trapezoid.setB(4);trapezoid.setHeight(45);
        System.out.println(trapezoid.calculateArea());

    }
}
