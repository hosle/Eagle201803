package com.hosle.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSubstringsInParenthesesTest {

    @Test
    void solution() {
        assertEquals("dcba", new ReverseSubstringsInParentheses().solution("(abcd)"));
    }

    @Test
    void solution2() {
        assertEquals("iloveu", new ReverseSubstringsInParentheses().solution("(u(love)i)"));
    }

    @Test
    void solution3() {
        assertEquals("leetcode", new ReverseSubstringsInParentheses().solution("(ed(et(oc))el)"));
    }

    @Test
    void solution4() {
        assertEquals("apmnolkjihgfedcbq", new ReverseSubstringsInParentheses().solution("a(bcdefghijkl(mno)p)q"));
    }

    @Test
    void solution5() {
        assertEquals("cbadegf", new ReverseSubstringsInParentheses().solution("(abc)de(fg)"));
    }
}