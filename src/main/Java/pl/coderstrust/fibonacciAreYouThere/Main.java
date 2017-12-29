package pl.coderstrust.fibonacciAreYouThere;

public class Main {
    public static void main(String[] args) {
        int numberToCheck = 21;
        if (FibonacciChecker.fibonacciChecker(numberToCheck)) System.out.println("Number: " + numberToCheck + " is Fibonacci number");
        else System.out.println("Number: " + numberToCheck + " is NOT Fibonacci number");
    }
}
