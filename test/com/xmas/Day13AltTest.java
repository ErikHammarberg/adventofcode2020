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

}