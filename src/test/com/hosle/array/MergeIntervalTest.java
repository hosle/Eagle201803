package com.hosle.array;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MergeIntervalTest {

    @Test
    public void solution() {
        ArrayList<int[]> data = new ArrayList<int[]>(
                Arrays.asList(
                        new int[]{1,3},
                        new int[]{2,6},
                        new int[]{8,10},
                        new int[]{15,18}
                )
        );

        ArrayList<int[]> expectedResult = new ArrayList<int[]>(
                Arrays.asList(
                        new int[]{1,6},
                        new int[]{8,10},
                        new int[]{15,18}
                )
        );

        assertArrayEquals(expectedResult.toArray(),new MergeInterval().solution(data).toArray());


        ArrayList<int[]> data2 = new ArrayList<int[]>(
                Arrays.asList(
                        new int[]{2,6},
                        new int[]{1,3},
                        new int[]{8,17},
                        new int[]{15,18}
                )
        );

        int[][] expectedResult2 = new int[][]{
                new int[]{1, 6},
                new int[]{8, 18}
        };

        assertArrayEquals(expectedResult2,new MergeInterval().solution(data2).toArray());

        ArrayList<int[]> data3 = new ArrayList<int[]>(
                Arrays.asList(
                        new int[]{2,6},
                        new int[]{1,3},
                        new int[]{8,17},
                        new int[]{8,15},
                        new int[]{15,18}
                )
        );

        int[][] expectedResult3 = new int[][]{
                new int[]{1, 6},
                new int[]{8, 18}
        };

        assertArrayEquals(expectedResult3,new MergeInterval().solution(data3).toArray());

    }
}