package com.hosle.array;

import com.hosle.array.FindDuplicate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;


/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class FindDuplicateTest {

    int[] data;
    int result;

    @AfterAll
    public void tearDown() throws Exception {
        result = new FindDuplicate().solution(data);
        System.out.print(result);
    }

    @Test
    public void solution() throws Exception {
        data = new int[]{2,5,1,1,4,3};
    }

    @Test
    public void solution2() throws Exception {
        data = new int[]{0,1,2,4,2,3};
    }

    @Test
    public void solution3() throws Exception {
        data = new int[]{1,5,2,3,4,4};
    }

}