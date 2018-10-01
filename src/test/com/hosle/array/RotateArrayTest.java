package com.hosle.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution1() {
        int[] data = new int[]{1,2,3,4,5,6,7};

        int[] result = new RotateArray().solution1(data,3,7);

        assertArrayEquals(new int[]{5,6,7,1,2,3,4},result);

    }

    @Test
    public void solution2() {
        int[] data = new int[]{1,2,3,4,5,6,7};

        new RotateArray().solution2(data,3,7);

        assertArrayEquals(new int[]{5,6,7,1,2,3,4},data);
    }
}