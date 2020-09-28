package com.hosle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 * <p>
 * Given a collection of distinct integers, return/print all possible permutations.
 * https://leetcode.com/problems/permutations/
 * <p>
 * time complexity : o(N*N!)
 */
public class Permutation {

    public List<List<String>> solutionForList(String dataString) {
        List<List<String>> result = new ArrayList<>();

        String[] data = dataString.split("");

        findPermutation(data, result, new ArrayList<>(), 0);

        return result;
    }

    private void findPermutation(String[] data, List<List<String>> result, List<String> perList, int start) {

        if (start == data.length) {
            result.add(new ArrayList(perList));
            return;
        }

        for (int i = start; i < data.length; i++) {
            perList.add(data[i]);
            swap(data, i, start);
            findPermutation(data, result, perList, start + 1);
            swap(data, i, start);
            perList.remove(perList.size() - 1);
        }
    }

    public void solution(String dataString) {

        if (null == dataString)
            throw new IllegalArgumentException("dataString is null");

        String[] data = dataString.split("");

        printArrangement(data, 0);

    }

    private void printArrangement(String[] data, int start) {
        if (start == data.length - 1) {
            for (String item : data) {
                System.out.print(item);
            }
            System.out.println();
            return;
        }

        for (int i = start; i < data.length; i++) {
            swap(data, start, i);
            printArrangement(data, start + 1);
            swap(data, start, i);
        }
        System.out.println();

    }

    private void swap(String[] data, int a, int b) {
        if (a == b) return;

        String temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public void solution2(int[] input) {
        int left = 0;
        int right = input.length - 1;
        permutation(input, left, right);
    }

    private void permutation(int[] input, int start, int end) {
        if (start == end) {
            for (int item : input) {
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end; i++) {
            swap(input, i, start);
            permutation(input, start + 1, end);
            swap(input, i, start);
        }
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
