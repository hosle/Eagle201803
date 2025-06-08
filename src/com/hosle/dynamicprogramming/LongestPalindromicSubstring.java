package com.hosle.dynamicprogramming;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
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

    public String solution(String input) {
        if (input.length() <= 1)
            return input;

        int[][] isPalindromic = new int[input.length()][input.length()];

        int palindromicLength = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i< input.length(); i++) {
            isPalindromic[i][i] = 1;
        }

        for (int i = 1; i < input.length(); i++){

            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == input.charAt(i) && (isPalindromic[j+1][i-1] == 1 || i - j == 1)){
                    isPalindromic[j][i] = 1;
                    if (i - j + 1 > palindromicLength){
                        start = j;
                        end = i;
                        palindromicLength = i - j + 1;
                    }
                }
            }
        }

        for (int i = 0; i < input.length(); i++){
            for (int j = 0; j< input.length(); j++) {
                System.out.print(isPalindromic[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        return input.substring(start, end+1);
    }
}
