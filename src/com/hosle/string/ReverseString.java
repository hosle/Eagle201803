package com.hosle.string;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class ReverseString {

    public String solution(String s) {
        if (s == null) return "";

        StringBuilder rString = new StringBuilder();
        String[] sArray = s.split("");
        for (int i = sArray.length - 1; i >= 0; i--) {
            rString.append(sArray[i]);
        }

        return rString.toString();
    }
}
