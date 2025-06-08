package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    void solution() {
        String text1 = "abcde";
        String text2 = "ace";

        assertEquals(3, new LongestCommonSubsequence().solution(text1, text2));
    }

    @Test
    void solution2() {
        String text1 = "abc";
        String text2 = "abc";

        assertEquals(3, new LongestCommonSubsequence().solution(text1, text2));
    }

    @Test
    void solution3() {
        String text1 = "abc";
        String text2 = "def";

        assertEquals(0, new LongestCommonSubsequence().solution(text1, text2));
    }
}