package com.hosle.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubarraySumTest {

    @Test
    void solution() {
        assertFalse(new ContinuousSubarraySum().solution(new int[]{5,0,0,0}, 3));
        // 5 5 5
        // 5 5 5

        assertFalse(new ContinuousSubarraySum().solution(new int[]{23,6,9}, 6));
        // 23 29 38
        // 5  5 2

        assertFalse(new ContinuousSubarraySum().solution(new int[]{12,1,2}, 6));
        // 12, 13, 15
        // 0, 1, 3
        assertFalse(new ContinuousSubarraySum().solution(new int[]{1,2,4,2}, 6));
        // 1 3 7 9
        // 1 3 1 3
        assertFalse(new ContinuousSubarraySum().solution(new int[]{1,2,12}, 6));
        // 1 3 15
        // 1 3 3
        assertFalse(new ContinuousSubarraySum().solution(new int[]{1,2,1,1}, 8));
        // 1 3 4 5
        // 1 3 4 3
        assertFalse(new ContinuousSubarraySum().solution(new int[]{1,0}, 2));
        assertTrue(new ContinuousSubarraySum().solution(new int[]{23,2,4,6,6}, 7));
        // 23 25 29 35 41
        // 2 4 1 0 6
        //
        assertTrue(new ContinuousSubarraySum().solution(new int[]{23,2,4,6,7}, 6));
        assertTrue(new ContinuousSubarraySum().solution(new int[]{23,2,6,4,7}, 6));
        assertFalse(new ContinuousSubarraySum().solution(new int[]{23,2,6,4,7}, 13));
        assertTrue(new ContinuousSubarraySum().solution(new int[]{23,2,6,4,7,-7}, 13));
        assertTrue(new ContinuousSubarraySum().solution(new int[]{0,0}, 13));
        // 0 0
        // 0 0
        assertFalse(new ContinuousSubarraySum().solution(new int[]{0}, 13));
        // 0
        // 0
    }
}