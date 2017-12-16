package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void checkprimeNumberselements() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int [] test = {0, 0, 2, 3, 0, 5, 0, 7, 0, 0, 0, 11, 0, 13, 0, 0, 0, 17, 0, 19};
        int [] result = PrimeNumbers.primeNumbers();
        assertArrayEquals(test,result);

    }
}