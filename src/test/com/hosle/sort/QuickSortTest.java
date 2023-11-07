package com.hosle.sort;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class QuickSortTest {

    static Integer[] result;


    @AfterAll
    public static void tearDown() throws Exception {

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

    @Test
    public void solution5(){
        long a =-10;
        System.out.println(a>>>1);
    }
}