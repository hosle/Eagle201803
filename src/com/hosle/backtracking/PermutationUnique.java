package com.hosle.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * https://leetcode.com/problems/permutations-ii/
 */
public class PermutationUnique {

    public void solution(int[] input) {

        int start = 0;
        int end = input.length -1;

        permutation(input, start, end);
    }

    private void permutation(int[] input, int start, int end) {
        if (start == end) {
            for (int item : input) {
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }

        HashSet<Integer> existSet = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (existSet.add(input[i])) {
                swap(input, i, start);
                permutation(input, start + 1, end);
                swap(input, i, start);
            }
        }
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public List<List<Integer>> solution2(int[] input) {
        int start = 0;
        int end = input.length -1;
        List<List<Integer>> original = new ArrayList<>();
        permutationUnique(input, start, end, original);
        return original;
    }

    private void permutationUnique(int[] input, int start, int end, List<List<Integer>> original){
        if (start == end) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int item : input) {
//                System.out.print(item + " ");
                result.add(item);
            }
            System.out.println();
            original.add(result);
            return;
        }
        HashSet<Integer> existSet = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (existSet.add(input[i])) {
                swap(input, i, start);
                permutationUnique(input, start + 1, end, original);
                swap(input, i, start);
            }
        }
    }
}
