package com.hosle.backtracking;

import com.hosle.backtracking.SubSets;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;


/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SubSetsTest {
    int[]data;
    List<List<Integer>> result = null;
    @AfterAll
    public void tearDown() throws Exception {
        for(List<Integer> itemList : result){
            for(int item : itemList){
                System.out.print(item+",");
            }
            System.out.println();
        }

    }

    @Test
    public void solution() throws Exception {
        data = new int[]{1,2,3};

        result = new SubSets().solution(data);
    }

}