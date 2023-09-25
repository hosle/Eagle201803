package com.hosle.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateArrayTest {

    @Test
    public void solution1() {
        int[] data = new int[]{1,2,3,4,5,6,7};

        int[] result = new RotateArray().solution1(data,3,7);

        assertEquals(new int[]{5,6,7,1,2,3,4},result);

    }

    @Test
    public void solution2() {
        int[] data = new int[]{1,2,3,4,5,6,7};

        new RotateArray().solution2(data,3,7);

        assertEquals(new int[]{5,6,7,1,2,3,4},data);
    }
}