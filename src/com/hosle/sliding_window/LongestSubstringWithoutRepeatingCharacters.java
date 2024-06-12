package com.hosle.sliding_window;

/**
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

// abba
    public int solution(String s){

        if (s.isEmpty())
            return 0;

        int i = 0, j = 0, maxLen = 0;
        HashMap<String, Integer> see = new HashMap<>(); // character -> last position
        String[] sArr = s.split("");
        for (j = 0 ; j < sArr.length; j++){
            if (see.containsKey(sArr[j])) {
                maxLen = Math.max(maxLen, j - i);
                i = Math.max(i, see.get(sArr[j]) + 1);
            }
            see.put(sArr[j], j);
        }

        maxLen = Math.max(maxLen, j - i);

        return maxLen;
    }
}
