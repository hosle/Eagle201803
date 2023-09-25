package com.hosle.string;

import com.hosle.string.ReverseString;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class ReverseStringTest {

    String result;

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void solution() throws Exception {
        result = new ReverseString().solution("");
    }


    @Test
    public void solution2() throws Exception {
        result = new ReverseString().solution(null);
    }


    @Test
    public void solution3() throws Exception {
        result = new ReverseString().solution("abcde");
    }


    @Test
    public void solution4() throws Exception {
        result = new ReverseString().solution("a b");
    }

}