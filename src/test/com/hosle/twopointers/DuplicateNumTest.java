package com.hosle.twopointers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateNumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        assertEquals(2,new DuplicateNum().solution(new int[]{1,3,4,2,2}));
        assertEquals(3,new DuplicateNum().solution(new int[]{3,1,3,4,2}));

    }
}