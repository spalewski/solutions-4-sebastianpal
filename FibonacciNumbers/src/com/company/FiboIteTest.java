package com.company;

import static org.junit.Assert.*;

public class FiboIteTest {

    @org.junit.Test
    public void testSelectedNumberfiboIte() {


        long testedNumber1 = FiboIte.fiboIte(1);
        long testedNumber2 = FiboIte.fiboIte(2);
        long testedNumber3 = FiboIte.fiboIte(3);

        long number1 = 1;
        long number2 = 1;
        long number3 = 2;


        assertEquals(number1, testedNumber1);
        assertEquals(number2, testedNumber2);
        assertEquals(number3, testedNumber3);



    }
}