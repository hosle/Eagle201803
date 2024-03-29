package com.hosle.string;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ReverseString2Test {

    @BeforeAll
    public void setUp() throws Exception {
    }

    @AfterAll
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {
        ReverseString2 reverse = new ReverseString2();

        assertEquals("olleh",reverse.solution("hello"));
        assertEquals("A man, a plan, a canal: Panama",reverse.solution("amanaP :lanac a ,nalp a ,nam A"));
        assertEquals("","");
        assertNull(reverse.solution(null));
    }
}