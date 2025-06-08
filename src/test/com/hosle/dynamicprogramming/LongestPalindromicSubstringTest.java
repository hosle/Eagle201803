package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
        assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
        assertEquals("abba", new LongestPalindromicSubstring().longestPalindrome("babbad"));
    }

    @Test
    void testSolution() {
        assertEquals("abba", new LongestPalindromicSubstring().solution("babbad"));
        assertEquals("bb", new LongestPalindromicSubstring().solution("cbbd"));
        assertEquals("bab", new LongestPalindromicSubstring().solution("babad"));
        assertEquals("a", new LongestPalindromicSubstring().solution("a"));

    }
}