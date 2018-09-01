package com.hosle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 * <p>
 * [1,2,3]
 */
public class SubSets {

    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (nums.length == 0) {
            resultList.add(new ArrayList<>());
            return resultList;
        }

        int start = 0;

        resultList = findSubSet(nums, start);

        return resultList;

    }

    private List<List<Integer>> findSubSet(int[] data, int start) {

        List<List<Integer>> newSets = new ArrayList<>();
        ;

        List<Integer> singleSet = new ArrayList<>();
        singleSet.add(data[start]);

        if (start == data.length - 1) {

            newSets.add(singleSet);
            return newSets;
        } else {
            List<List<Integer>> oldSets = findSubSet(data, start + 1);

            for (List<Integer> itemSet : oldSets) {
                itemSet.add(data[start]);
                newSets.add(itemSet);
            }
            newSets.add(singleSet);
            newSets.addAll(oldSets);

            return newSets;
        }
    }

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> solution2(int[] nums) {

        findSubSet(nums, 0, new ArrayList<>());

        return result;
    }


    private void findSubSet(int[] data, int start, List<Integer> oneSet) {

        result.add(new ArrayList<>(oneSet));

        for (int i = start; i < data.length; i++) {
            oneSet.add(data[i]);
            findSubSet(data, start + 1, oneSet);
            oneSet.remove(oneSet.size() - 1);
        }
    }

}


