package com.hosle.sort;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class BucketSortTest {

    @Test
    public void solution() {

        ArrayList<Float> result = new BucketSort().solution(new float[]{0.3f, 0.7f, 0.18f, 0.93f, 0.87f, 0.62f, 0.63f});

        for (Float item : result) {
            System.out.print(item + " ");
        }
    }
}