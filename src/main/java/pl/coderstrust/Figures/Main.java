package pl.coderstrust.Figures;

public class Main {

    public static void main(String[] args) {
       Calculable circle = new Cicrcle(10);
       circle.calculateArea();
       System.out.println(circle.calculateArea());

        Calculable trangle1 = new Triangle(21,23);
        trangle1.calculateArea();
        System.out.println(trangle1.calculateArea());

        Calculable rectangle = new Rectangle(10 , 20);
        System.out.println(rectangle.calculateArea());
        Calculable square = new Square(10);
        System.out.println(square.calculateArea());

    }
}
