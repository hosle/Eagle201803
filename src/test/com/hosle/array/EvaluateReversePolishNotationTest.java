package com.hosle.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        String[] data =  new String[]{"2", "1", "+", "3", "*"};
        String[] data2 =  new String[]{"4", "13", "5", "/", "+"};

        assertEquals(9,new EvaluateReversePolishNotation().solution(data));
        assertEquals(6,new EvaluateReversePolishNotation().solution(data2));

    }
}