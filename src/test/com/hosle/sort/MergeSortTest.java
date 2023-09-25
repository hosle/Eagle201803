package com.hosle.sort;


import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void solution() {

        int[] input = new int[]{3, 2, 4, 6, 12, 1, 9, 7};

        new MergeSort().solution(input);

        for (int i1 : input) {
            System.out.print(i1 + " ");
        }
    }
}