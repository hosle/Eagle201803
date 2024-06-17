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
}