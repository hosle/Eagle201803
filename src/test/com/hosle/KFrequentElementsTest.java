package com.hosle;

import com.hosle.KFrequentElements;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KFrequentElementsTest {

    List<Integer> result;

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {
        for(int item:result){
            System.out.print(item+",");
        }
    }

    @Test
    public void topKFrequent() throws Exception {

        result = new KFrequentElements().topKFrequentWithTreeMap(new int[]{1,1,1,2,2,3},2);
    }

    @Test
    public void topKFrequent2() throws Exception {

        result = new KFrequentElements().topKFrequentWithTreeMap(new int[]{4,1,-1,2,-1,2,3},2);
    }

    @Test
    public void topKFrequent3() throws Exception {

        result = new KFrequentElements().topKFrequent(new int[]{4},1);
    }

}