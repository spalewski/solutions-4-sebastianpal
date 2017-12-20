package pl.coderstrust.fibonacci.rekurention;

import org.junit.Assert;

public class FibonacciTest {

    @org.junit.Test
    public void TestFibonacci() {

        long testedNumber1 = Fibonacci.fiboReku(0);
        long testedNumber2 = Fibonacci.fiboReku(1);
        long testedNumber3 = Fibonacci.fiboReku(2);
        long testedNumber4 = Fibonacci.fiboReku(3);

        long number1 = 0;
        long number2 = 1;
        long number3 = 1;
        long number4 = 2;


        Assert.assertEquals(number1, testedNumber1);
        Assert.assertEquals(number2, testedNumber2);
        Assert.assertEquals(number3, testedNumber3);
        Assert.assertEquals(number4, testedNumber4);
    }
}
