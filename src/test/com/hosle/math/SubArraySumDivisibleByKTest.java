package com.hosle.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArraySumDivisibleByKTest {

    @Test
    void solution() {
        int[] nums = new int[]{4,5,0,-2,-3,1};

        assertEquals(7,new SubArraySumDivisibleByK().solution(nums,5));
    }
}