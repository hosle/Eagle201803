package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void solution() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }
}