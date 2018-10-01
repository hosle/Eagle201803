package com.hosle.array;

/**
 * Given a string, determine if it is a palindrome,
 *
 * considering only alphanumeric characters and ignoring cases.
 *
 * For example, "Red rum, sir, is murder" is a palindrome,
 *
 * while "Programcreek is awesome" is not.
 *
 * Note:
 * Have you consider that the string might be empty?
 *
 * This is a good question to ask during an interview.
 *
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

    public boolean solution(String s){
        if(s==null||s.length()==0) return false;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
}
