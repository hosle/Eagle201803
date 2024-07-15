package com.hosle.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2024-07-11
 * <p>
 * You are given a string s that consists of lower case English letters and brackets.
 * <p>
 * Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 * <p>
 * Your result should not contain any brackets.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "(abcd)"
 * Output: "dcba"
 * Example 2:
 * <p>
 * Input: s = "(u(love)i)"
 * Output: "iloveu"
 * Explanation: The substring "love" is reversed first, then the whole string is reversed.
 * Example 3:
 * <p>
 * Input: s = "(ed(et(oc))el)"
 * Output: "leetcode"
 * Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 2000
 * s only contains lower case English characters and parentheses.
 * It is guaranteed that all parentheses are balanced.
 */
public class ReverseSubstringsInParentheses {
    public String solution(String s) {
        Stack<String> mystack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                mystack.push("");
            } else if (c == ')') {
                String x1 = reverse(mystack.pop());
                if (!mystack.isEmpty()) {
                    String x2 = mystack.pop();
                    mystack.push(x2 + x1);
                } else {
                    mystack.push(x1);
                }
            } else {
                String last = "";
                if (!mystack.isEmpty()) {
                    last = mystack.pop();
                }
                mystack.push(last + c);
            }
        }
        return mystack.pop();
    }

    public String reverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        return builder.toString();
    }

}
