package com.hosle.backtracking;

import com.hosle.backtracking.Permutation;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class PermutationTest {

    List<List<String>> result;

    @Test
    public void solution() throws Exception {
        new Permutation().solution("abcde");
    }

    @Test
    public void solutionForResult() throws Exception {
        result = new Permutation().solutionForList("abcde");

        for(List<String> list:result){
            for(String item: list){
                System.out.print(item+",");
            }
            System.out.println();
        }
    }

    @Test
    public void solution2() {
        new Permutation().solution2(new int[]{1,2,3});
    }

    @Test
    public void solution3() {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(new Integer[]{1,2,3}));

        new Permutation().permutation4(new LinkedList<Integer>(), input);
    }

}