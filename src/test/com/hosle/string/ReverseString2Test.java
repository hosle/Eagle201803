package com.hosle.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseString2Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
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