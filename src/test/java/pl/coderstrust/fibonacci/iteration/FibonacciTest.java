package pl.coderstrust.fibonacci.iteration;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @org.junit.Test
    public void testSelectedNumberfiboIte() {


        long testedNumber1 = Fibonacci.fiboIte(1);
        long testedNumber2 = Fibonacci.fiboIte(2);
        long testedNumber3 = Fibonacci.fiboIte(3);

        long number1 = 1;
        long number2 = 1;
        long number3 = 2;


        assertEquals(number1, testedNumber1);
        assertEquals(number2, testedNumber2);
        assertEquals(number3, testedNumber3);


    }
}