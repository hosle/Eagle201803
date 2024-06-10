package com.hosle.string;

/**
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 *
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 */
public class MissingChar {

    public String missingChar(String str, int n){
        char[] input = str.toCharArray();
        if (n == str.length() -1) {
            return str.substring(0,n);
        } else {
            for (int i = n; i < input.length - 1; i++) {
                input[i] = input[i+1];
            }
            return new String(input, 0, input.length - 1);
        }
    }
}
