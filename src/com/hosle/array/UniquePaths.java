package com.hosle.array;

import java.util.HashMap;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class UniquePaths {

    HashMap<Integer,Integer> solutionCell = new HashMap<>();

    public int solution(int m,int n) {

        int i = 1, j = 1;

        solutionCell.put(12, 1);
        solutionCell.put(21, 1);

        return solution(m - 1, n) + solution(n, m - 1);

    }
}
