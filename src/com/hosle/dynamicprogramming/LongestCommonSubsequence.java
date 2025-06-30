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

    //brute force
    public int solution1(String text1, String text2) {
        int count = 0;
        for (char char1 : text1.toCharArray()) {
            for (char char2 : text2.toCharArray()) {
                if (char1 == char2) {
                    count++;
                }
            }
        }
        return count;
    }

    // recursion
    public int solution2(String text1, String text2) {
        if (text1.isEmpty() || text2.isEmpty()){
            return 0;
        }
        if (text1.charAt(text1.length()-1) == text2.charAt(text2.length()-1)){
            return solution2(text1.substring(0,text1.length()-1),text2.substring(0,text2.length()-1)) + 1;
        }else {
            return Math.max(solution2(text1.substring(0,text1.length()-1), text2), solution2(text1, text2.substring(0,text2.length()-1)));
        }
    }

    // dp memoization
    public int solution3(String text1, String text2, int[][] intermedia) {
        if (text1.isEmpty() || text2.isEmpty()) {
            return 0;
        }
        int length1 = text1.length();
        int length2 = text2.length();
        if (intermedia[length1][length2] != -1){
            return intermedia[length1][length2];
        }

        if (text1.charAt(length1 - 1) == text2.charAt(length2 - 1)) {
            intermedia[length1][length2] = solution3(text1.substring(0, length1 - 1), text2.substring(0, length2 - 1), intermedia) + 1;
            return intermedia[length1][length2];
        } else {
            intermedia[length1][length2] = Math.max(solution3(text1.substring(0, length1 - 1), text2, intermedia), solution3(text1, text2.substring(0, length2 - 1), intermedia));

            return intermedia[length1][length2];
        }
    }
}
