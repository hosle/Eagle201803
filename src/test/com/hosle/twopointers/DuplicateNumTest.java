package com.hosle.twopointers;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateNumTest {

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        assertEquals(2,new DuplicateNum().solution(new int[]{1,3,4,2,2}));
        assertEquals(3,new DuplicateNum().solution(new int[]{3,1,3,4,2}));

    }
}