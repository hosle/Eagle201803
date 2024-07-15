package com.hosle.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/maximum-score-from-removing-substrings/description/?envType=daily-question&envId=2024-07-12
 *
 * You are given a string s and two integers x and y. You can perform two types of operations any number of times.
 *
 * Remove substring "ab" and gain x points.
 * For example, when removing "ab" from "cabxbae" it becomes "cxbae".
 * Remove substring "ba" and gain y points.
 * For example, when removing "ba" from "cabxbae" it becomes "cabxe".
 * Return the maximum points you can gain after applying the above operations on s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cdbcbbaaabab", x = 4, y = 5
 * Output: 19
 * Explanation:
 * - Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
 * - Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
 * - Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
 * - Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
 * Total score = 5 + 4 + 5 + 5 = 19.
 * Example 2:
 *
 * Input: s = "aabbaaxybbaabb", x = 5, y = 4
 * Output: 20
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * 1 <= x, y <= 104
 * s consists of lowercase English letters.
 */
public class MaximumScoreFromRemovingSubstrings {
    public int solution(String s, int x, int y) {
        Stack<Character> stack = new Stack<Character>();

        int bigPoint = y;
        int smallPoint = x;
        char big = 'b';
        char small = 'a';

        if (x > y) {
            bigPoint = x;
            smallPoint = y;
            big = 'a';
            small = 'b';
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == small && !stack.isEmpty() && stack.peek() == big) {
                result += bigPoint;
                stack.pop();
            } else if (cur == big || cur == small) {
                stack.push(cur);
            } else {
                Stack<Character> stack2 = new Stack<>();
                while (!stack.isEmpty()) {
                    char cur2 = stack.pop();
                    if (!stack2.isEmpty() && stack2.peek() != cur2) {
                        result += smallPoint;
                        stack2.pop();
                    } else {
                        stack2.push(cur2);
                    }
                }
            }
        }

        Stack<Character> stack3 = new Stack<>();
        while (!stack.isEmpty()) {
            char cur2 = stack.pop();

            if (!stack3.isEmpty() && stack3.peek() != cur2) {
                result += smallPoint;
                stack3.pop();
            } else {
                stack3.push(cur2);
            }
        }

        return result;
    }
}
