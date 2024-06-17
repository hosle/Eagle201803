package com.hosle.dynamicprogramming;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * Given a string s, return the longest
 * palindromic
 * <p>
 * substring
 * in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        //f(n) = max (f(n:(0-n-1)), f(n-1))
        int len = s.length();

        if (len <= 1) {
            return s;
        }

        boolean[][] palindrome = new boolean[len][len];
        int maxLen = 1;
        int start = 0;
        int end = 0;
        palindrome[0][0] = true;

        for (int i = 0; i < len; ++i) {
            palindrome[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || palindrome[j + 1][i - 1])) {
                    palindrome[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);

    }
}
