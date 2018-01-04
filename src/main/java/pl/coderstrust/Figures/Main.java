package pl.coderstrust.Figures;

public class Main {

    public static void main(String[] args) {
       Figure circle = new Cicrcle(10);
       circle.calculateArea();
       System.out.println(circle.calculateArea());

        Figure trangle1 = new Triangle(21,23);
        trangle1.calculateArea();
        System.out.println(trangle1.calculateArea());

        Figure rectangle = new Rectangle(10 , 20);
        System.out.println(rectangle.calculateArea());
        Figure square = new Square(10);
        System.out.println(square.calculateArea());

    }
}
