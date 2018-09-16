package com.hosle.basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class UtilsTest {

    int[] dataInt = new int[]{1,3,4,8,10,2};
    Integer[] dataInteger = new Integer[]{1,3,4,8,10,2};

    LinkedList<Integer> dataList = new LinkedList<>();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        Arrays.sort(dataInt);
        for(int item : dataInt){
            System.out.print(item+",");
        }
    }

    @Test
    public void sortList(){
        dataList = new LinkedList<>(Arrays.asList(dataInteger));
        dataList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for(Integer item : dataList){
            System.out.print(item+",");
        }
    }
}