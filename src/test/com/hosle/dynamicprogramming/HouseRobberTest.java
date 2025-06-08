package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void solution() {
        int[] nums = new int[]{2,7,9,3,1};
        int result = new HouseRobber().solution(nums);
        System.out.println(result);
        assertEquals(12, result);
    }

    @Test
    void solution2() {
        int[] nums = new int[]{1,2,3,1};
        int result = new HouseRobber().solution(nums);
        System.out.println(result);
        assertEquals(4, result);
    }

    @Test
    void solution3(){
        int[] nums = new int[]{2,7,9,3,1};

        assertEquals(12, new HouseRobber().solution2(nums));

    }


}