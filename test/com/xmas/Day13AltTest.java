package com.xmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day13AltTest {

    Day13Alt sut = new Day13Alt();

    @Test
    public void testAlgo() {
        var result = sut.combinedPhasedRotations(new Day13Alt.Rotation(15, 3), new Day13Alt.Rotation(9,0));
        assertEquals(45, result.period());
        assertEquals(18,result.offset());
    }
    @Test
    public void testAlgo2() {
        var result = sut.combinedPhasedRotations(new Day13Alt.Rotation(38, 6), new Day13Alt.Rotation(30,0));
        assertEquals(570, result.period());
        assertEquals(120,result.offset());
    }

    @Test
    public void testTwoExample() {
        long result = sut.solveTwo(exampleInput);
        System.out.println();
        assertEquals(1068781l, result);
    }

    @Test
    public void testTwo2() {
        long result = sut.solveTwo("1\n67,7,59,61");
        assertEquals(754018, result);
    }

    @Test
    public void testTwo3() {
        long result = sut.solveTwo("1\n17,x,13,19");
        assertEquals(3417, result);
    }
    @Test
    public void testTwo4() {
        long result = sut.solveTwo("1\n67,x,7,59,61");
        assertEquals(779210, result);
    }
    @Test
    public void testTwo5() {
        long result = sut.solveTwo("1\n67,7,x,59,61");
        assertEquals(1261476, result);
    }
    @Test
    public void testTwo6() {
        long result = sut.solveTwo("1\n1789,37,47,1889");
        assertEquals(1202161486, result);
    }

    @Test
    public void testTwo() {
        long result = sut.solveTwo(input);
        System.out.println(result);
        assertTrue(1417597638710255l > result);
        assertTrue(472904986744344l< result);
    }

    String exampleInput =
            "939\n" +
                    "7,13,x,x,59,x,31,19";

    String input =
            "1008832\n" +
                    "23,x,x,x,x,x,x,x,x,x,x,x,x,41,x,x,x,x,x,x,x,x,x,449,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,13,19,x,x,x,x,x,x,x,x,x,29,x,991,x,x,x,x,x,37,x,x,x,x,x,x,x,x,x,x,17";


}