package com.hosle.string;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */
import java.util.*;
public class StringTimes {

    public String solution(String str, int n) {
        if (str.isEmpty()){
            return str;
        }

        int strLen = str.length();

        char[] newStr = new char[strLen * n];
        char[] oriStr = str.toCharArray();

        for (int i = 0; i< n*strLen; i++){
            newStr[i] = oriStr[i%strLen];
        }
        return String.valueOf(newStr);
    }

    public String solution2(String str, int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<n; i++){
            result.append(str);
        }
        return result.toString();
    }
}
