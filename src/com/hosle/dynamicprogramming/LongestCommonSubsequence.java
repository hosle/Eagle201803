package com.hosle.dynamicprogramming;

/**
 * https://leetcode.com/problems/longest-common-subsequence/description/
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * <p>
 * Example 2:
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * <p>
 * Example 3:
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= text1.length, text2.length <= 1000
 * text1 and text2 consist of only lowercase English characters.
 */
public class LongestCommonSubsequence {
    public int solution(String text1, String text2) {

        int lengthOfSubsequence = 0;

        for (int i = 0; i < text1.length(); i++) {
            int start = 0;
            for (int j = start; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    lengthOfSubsequence++;
                    start++;
                }
            }
        }

        return lengthOfSubsequence;
    }
}
