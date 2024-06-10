package com.hosle.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {

    /**
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */
    @Test
    void solution() {
        assertEquals("HiHi", new StringTimes().solution("Hi",2));
        assertEquals("HiHiHi", new StringTimes().solution("Hi",3));
        assertEquals("Hi", new StringTimes().solution("Hi",1));
        assertEquals("xxxx", new StringTimes().solution("x",4));
    }

    @Test
    void solution2() {
        assertEquals("HiHi", new StringTimes().solution2("Hi",2));
        assertEquals("HiHiHi", new StringTimes().solution2("Hi",3));
        assertEquals("Hi", new StringTimes().solution2("Hi",1));
        assertEquals("xxxx", new StringTimes().solution2("x",4));
    }

    @Test
    void testSolution() {
    }
}