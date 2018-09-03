package com.hosle.string;

/**
 * Input: "hello"
 * Output: "olleh"
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString2 {

    public String solution(String str){
        if(null == str){
            return null;
        }

        int i = 0, j = str.length() - 1;
        char[] strs = str.toCharArray();

        while(i<j){
            swap(strs,i,j);
            ++i;
            --j;
        }
        return new String(strs);
    }

    private void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
