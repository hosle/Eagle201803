package com.hosle;

import com.hosle.KSmallestElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KSmallestElementTest {
    int[]data;
    int []result;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {


//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + ",");
//        }
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{2,3,4,8,6,5,4,3,11,99,21,3,8,1};
        result = new KSmallestElement().solution(data,4);
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{3,3,3,3};
        result = new KSmallestElement().solution(data,2);
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{4};
        result = new KSmallestElement().solution(data,2);
    }

    @Test
    public void solutionKth() {
        data = new int[]{3,2,1,5,6,4};
        assertEquals(5,new KSmallestElement().solution1(data,2));
    }

}