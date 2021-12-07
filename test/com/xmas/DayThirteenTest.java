package com.xmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayThirteenTest {

    DayThirteen sut = new DayThirteen();

    @Test
    public void exampleTestOne() {
        int result = sut.solveOne(exampleInput);
        assertEquals(295, result);
    }

    @Test
    public void testOne() {
        int result = sut.solveOne(input);
        assertEquals(5946, result);
        System.out.println(result);
    }

    @Test
    public void testTwoExample() {
        long result = sut.solveTwo(exampleInput);
        assertEquals(1068781l, result);
    }
    @Test
            public void testTwo() {
        long result = sut.solveTwo(input);
        System.out.println(result);
    }

    String exampleInput =
            "939\n" +
                    "7,13,x,x,59,x,31,19";

    String input =
            "1008832\n" +
                    "23,x,x,x,x,x,x,x,x,x,x,x,x,41,x,x,x,x,x,x,x,x,x,449,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,13,19,x,x,x,x,x,x,x,x,x,29,x,991,x,x,x,x,x,37,x,x,x,x,x,x,x,x,x,x,17\n";

}