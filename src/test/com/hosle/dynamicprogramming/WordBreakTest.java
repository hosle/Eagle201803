package com.hosle.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    /**
    * Example 1:
    *
    * Input: s = "leetcode", wordDict = ["leet","code"]
    * Output: true
    * Explanation: Return true because "leetcode" can be segmented as "leet code".
    * Example 2:
    *
    * Input: s = "applepenapple", wordDict = ["apple","pen"]
    * Output: true
    * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    * Note that you are allowed to reuse a dictionary word.
    * Example 3:
    *
    * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    * Output: false
     */

    @Test
    void wordBreak() {
        assertEquals(true, new WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"leet","code"})));
        assertEquals(true, new WordBreak().wordBreak("applepenapple", Arrays.asList(new String[]{"apple","pen"})));
        assertEquals(false, new WordBreak().wordBreak("catsandog", Arrays.asList(new String[]{"cats","dog","sand","and","cat"})));
    }
}