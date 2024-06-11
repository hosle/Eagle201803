package com.hosle.backtracking;

import java.util.*;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=study-plan-v2&envId=top-interview-150
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Example 2:
 *
 * Input: digits = ""
 * Output: []
 *
 * Example 3:
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 *
 * Constraints:
 *
 * 0 <= digits.length <= 4
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> solution(String digits) {
        HashMap<String,List<String>> digitLetterMap = new HashMap<>();

        digitLetterMap.put("2",Arrays.asList(new String[]{"a","b","c"}));
        digitLetterMap.put("3",Arrays.asList(new String[]{"d","e","f"}));
        digitLetterMap.put("4",Arrays.asList(new String[]{"g","h","i"}));
        digitLetterMap.put("5",Arrays.asList(new String[]{"j","k","l"}));
        digitLetterMap.put("6",Arrays.asList(new String[]{"m","n","o"}));
        digitLetterMap.put("7",Arrays.asList(new String[]{"p","q","r","s"}));
        digitLetterMap.put("8",Arrays.asList(new String[]{"t","u","v"}));
        digitLetterMap.put("9",Arrays.asList(new String[]{"w","x","y","z"}));

        ArrayList<String> results = new ArrayList<String>();
        for(int i = 0; i < digits.length();i++){
            String digit = digits.substring(i,i+1);
            StringBuilder oneResult = new StringBuilder();
            letterCombine(results, oneResult, digitLetterMap.get(digit),0);
        }

        return results;

    }

    public void letterCombine(List<String> result, StringBuilder curResult, List<String> optionalLetter, int index){
        if (index == optionalLetter.size()-1) {
            result.add(curResult.toString());
            return;
        }

        curResult.append(optionalLetter.get(index+1));
        letterCombine(result, curResult, optionalLetter, index+1);
        curResult.deleteCharAt(curResult.length()-1);
    }

}
