package com.hosle.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMidNumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        int[] data = new int[]{8,9,7,33,2,16,17,6,25};
        int[] dataEven = new int[]{9,9,7,33,2,16,17,6};
        int[] data1 = new int[]{9};
        int[] dataEmpty = new int[]{};

        assertEquals(9,new FindMidNum().solution(data));
        assertEquals(9,new FindMidNum().solution(dataEven));
        assertEquals(9,new FindMidNum().solution(data1));
        assertEquals(-1,new FindMidNum().solution(dataEmpty));
    }
}