package com.company;

import static org.junit.Assert.*;

public class FiboIteTest {

    @org.junit.Test
    public void testSelectedNumberfiboIte() {

        long testedNumber1 = FiboIte.fiboIte(0);
        long testedNumber2 = FiboIte.fiboIte(1);
        long testedNumber3 = FiboIte.fiboIte(2);
        long testedNumber4 = FiboIte.fiboIte(3);

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