package com.hosle.array;

import java.util.ArrayList;

public class InsertInterval {

    public ArrayList<int[]> solution(ArrayList<int[]> intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<int[]>();

        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            } else if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = interval;
            } else if (interval[1] >= newInterval[0] || interval[0] <= newInterval[1]) {
                newInterval = new int[]{Math.min(interval[0], newInterval[0]), Math.max(newInterval[1], interval[1])};
            }
        }

        result.add(newInterval);

        return result;
    }
}
