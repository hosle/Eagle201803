package com.hosle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjiahao on 2018/3/8.
 * Eagle201803
 *
 * [1,2,3]
 */
public class SubSets {
    List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> solution(int[] nums){

        findSubSet(nums,0,new ArrayList<>());

        return result;
    }

    private void findSubSet(int[]data, int start,List<Integer> oneSet){

        result.add(new ArrayList<>(oneSet));

        for(int i = start;i<data.length;i++){
             oneSet.add(data[i]);
             findSubSet(data,start+1,oneSet);
             oneSet.remove(oneSet.size()-1);
        }
    }
}
