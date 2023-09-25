package com.hosle.array;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    int[] data;

    @AfterAll
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