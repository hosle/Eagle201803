package com.hosle;

import com.hosle.KSmallestElementWithExtraSpace;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;


/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KSmallestElementWithExtraSpaceTest {

    int[] data;
    TreeMap<Integer,Integer> result;

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {

        for (Map.Entry<Integer, Integer> item : result.entrySet()) {
            System.out.print(item.getKey() + ",");
        }

    }

    @Test
    public void solution() throws Exception {
        data = new int[]{3,4,5,7,6,34,2,1};

        result = new KSmallestElementWithExtraSpace().solution(data,4);

    }

}