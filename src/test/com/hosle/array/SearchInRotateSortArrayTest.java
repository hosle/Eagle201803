package com.hosle.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotateSortArrayTest {

    int[] data;
    int target;
    int result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("result = "+ result);
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{4,5,6,7,0,1,2};
        target = 6;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,2);
    }

    @Test
    public void solution1() throws Exception {
        data = new int[]{4,5,6,7,0,1,2};
        target = 7;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,3);

    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{4,5,6,7,0,1,2};
        target = 0;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,4);
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{2,4,5,6,7,0,1};
        target = 1;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,6);

    }

    @Test
    public void solution4() throws Exception {
        data = new int[]{4,5};
        target = 5;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,1);

    }

    @Test
    public void solution5() throws Exception {
        data = new int[]{4,5,6,7,0,1,2};
        target = 8;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,-1);

    }

    @Test
    public void solution6() throws Exception {
        data = new int[]{3,1};
        target = 1;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,1);

    }

    @Test
    public void solution7() throws Exception {
        data = new int[]{3,4,5,6,1,2};
        target = 2;
        result = new SearchInRotateSortArray().solution(data,target);
        assertEquals(result,5);

    }

}