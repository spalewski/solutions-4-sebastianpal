package pl.coderstrust.fibonacci.rekurention;

public class Fibonacci {


    public static long fiboReku(int whichNumber) {
            if (whichNumber < 2)
                return whichNumber;
            else
                return (fiboReku(whichNumber - 1)) + (fiboReku(whichNumber - 2));
        }
    }
