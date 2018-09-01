package com.hosle.array;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortColorsTest {

    int[] data;

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{1,0,0,2,1,2};
        new SortColors().solution(data);

        assertArrayEquals(data,new int[]{0,0,1,1,2,2});
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{0};
        new SortColors().solution(data);

        assertArrayEquals(data,new int[]{0});
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{1,1,1,1,2,2,2,0,0,0};
        new SortColors().solution(data);

        assertArrayEquals(data,new int[]{0,0,0,1,1,1,1,2,2,2});
    }

}