package com.hosle.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 *
 * return [1,6],[8,10],[15,18].
 *
 */
public class MergeInterval {

    public List<int[]> solution(List<int[]> data){
        List<int[]> result = new ArrayList<>();

        data.sort(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }else{
                    return o1[1]-o2[1];
                }
            }
        });

        int[] current = data.get(0);

        for (int[] next : data) {
            if (current[1] < next[0]) {
                result.add(current);
                current = next;
            } else {
                int[] newInterval = new int[]{current[0], Math.max(current[1], next[1])};
                current = newInterval;
            }
        }
        result.add (current);

        return result;
    }

}
