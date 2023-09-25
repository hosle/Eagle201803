package com.hosle.array;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
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