package com.hosle.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Input:
 * k = 3, n = 4
 * arr[][] = { {1, 3, 5,  7},
 *             {2, 4, 6,  8},
 *             {0, 9, 10, 11}} ;
 *
 * Output: 0 1 2 3 4 5 6 7 8 9 10 11
 *
 * time complexity : o(N * k^2)
 *
 * improvement merge it to one dimension array, and quick sort
 * o(N* klog k)
 */
public class MergeKSortedArray {

    public int[] solution(int[][] input, int k, int n) {
        int[] result = new int[k * n];
        int[] indexes = new int[k];// 0,1,2,3

        int count = 0;
        while (count < k * n) {
            int smallNum = Integer.MAX_VALUE;
            int smallK = 0;
            for (int i = 0; i < k; i++) {
                int index = indexes[i];
                if (index < n && input[i][index] <= smallNum) {
                    smallNum = input[i][index];
                    smallK = i;
                }
            }
            indexes[smallK]++;
            result[count] = smallNum;

            count++;
        }
        return result;
    }

    public int[] solution2(int[][] input, int k, int n) {
        int[] result = new int[k*n];
        for (int i= 0; i< k; i++){
            System.arraycopy(input[i],0,result,i*n,input[i].length);
        }
        Arrays.sort(result);

        return result;
    }
}
