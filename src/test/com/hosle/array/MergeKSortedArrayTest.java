package com.hosle.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedArrayTest {

    @Test
    public void solution() {
        int[] result = new MergeKSortedArray().solution(new int[][]{new int[]{1,3,5,7}, new int[]{2,4,6,8}, new int[]{0,9,10,11}}, 3, 4);

        for(int i : result){
            System.out.print(i + " ");
        }
    }

    @Test
    public void solution2() {
        int[] result = new MergeKSortedArray().solution2(new int[][]{new int[]{1,3,5,7}, new int[]{2,4,6,8}, new int[]{0,9,10,11}}, 3, 4);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}