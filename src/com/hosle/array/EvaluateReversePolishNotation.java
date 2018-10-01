package com.hosle.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, /.
 *
 * Each operand may be an integer or another expression.
 *
 * For example:
 *
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateReversePolishNotation {

    public int solution(String[] data){
        int result = 0;
        Stack<String> stack = new Stack<String>();
        List<String> list = Arrays.asList(new String[]{"+","-","*","/"});
        for(String item : data){
            if(list.contains(item)){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                switch(item){
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(String.valueOf(result));
            }else{
                stack.push(item);
            }
        }
        return result;
    }
}
