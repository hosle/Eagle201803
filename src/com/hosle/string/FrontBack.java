package com.hosle.string;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class FrontBack {

    public String solution(String str){
        if (str == null || str.isEmpty()){
            return str;
        }

       char[] strArray = str.toCharArray();
       char temp = strArray[0];
       strArray[0] = strArray[strArray.length-1];
       strArray[strArray.length-1] = temp;
       return new String(strArray);
    }
}
