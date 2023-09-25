package com.hosle.array;

import com.hosle.array.ProductExceptSelf;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class ProductExceptSelfTest {

    int[] result;

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {

        for(int item : result){
            System.out.print(item+",");
        }
    }

    @Test
    public void productExceptSelf() throws Exception {
        result = new ProductExceptSelf().solution(new int[]{1,2,3,4});
    }

    @Test
    public void productExceptSelf2() throws Exception {
        result = new ProductExceptSelf().solution(new int[]{2,2,2});
    }

}