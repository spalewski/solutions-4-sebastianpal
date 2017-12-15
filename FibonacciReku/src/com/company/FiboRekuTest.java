package com.company;
import static org.junit.Assert.* ;
public class FiboRekuTest {

    @org.junit.Test
    public void TestfiboReku() {

        long testedNumber1 = FiboReku.fiboReku(0);
        long testedNumber2 = FiboReku.fiboReku(1);
        long testedNumber3 = FiboReku.fiboReku(2);
        long testedNumber4 = FiboReku.fiboReku(3);

        long number1 = 0;
        long number2 = 1;
        long number3 = 1;
        long number4 = 2;


        assertEquals(number1, testedNumber1);
        assertEquals(number2, testedNumber2);
        assertEquals(number3, testedNumber3);
        assertEquals(number4, testedNumber4);


    }
}