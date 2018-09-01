package com.hosle.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    Integer[] result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

        if(null!=result) {
            System.out.print("result size = " + result.length + ": ");

            for(Integer item : result) {
                System.out.print(item + ",");
            }
        }
    }

    @Test
    public void solution() {
        Integer[] intArray = new Integer[]{3,2,1,4,5,6,3};
        ArrayList<Integer> origin = new ArrayList<>(Arrays.asList(intArray));

        Arrays.sort(intArray);

        result = new QuickSort().solution(origin);

        assertArrayEquals(intArray,result);

    }

    @Test
    public void solution2() {
        Integer[] intArray = new Integer[]{3};
        ArrayList<Integer> origin = new ArrayList<>(Arrays.asList(intArray));

        Arrays.sort(intArray);

        result = new QuickSort().solution(origin);

        assertArrayEquals(intArray,result);

    }

    @Test
    public void solution3() {
        Integer[] intArray = new Integer[]{3,4,4,2,5,6,3};
        ArrayList<Integer> origin = new ArrayList<>(Arrays.asList(intArray));

        Arrays.sort(intArray);

        result = new QuickSort().solution(origin);

        assertArrayEquals(intArray,result);

    }

    @Test
    public void solution4() {
        Integer[] emptyArray = new Integer[0];

        result = new QuickSort().solution(null);

        assertArrayEquals(emptyArray,result);

    }
}