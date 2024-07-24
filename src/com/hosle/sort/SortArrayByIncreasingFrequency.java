package com.hosle.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/description
 * <p>
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
 * <p>
 * Return the sorted array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2,2,2,3]
 * Output: [3,1,1,2,2,2]
 * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 * Example 2:
 * <p>
 * Input: nums = [2,3,1,3,2]
 * Output: [1,3,3,2,2]
 * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
 * Example 3:
 * <p>
 * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
 * Output: [5,-1,4,4,-6,-6,1,1,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 */
public class SortArrayByIncreasingFrequency {
    public int[] solution(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            Integer exist = countMap.getOrDefault(num, 0);
            countMap.put(num, exist + 1);
        }

        int[][] numWithFrequency = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            numWithFrequency[i][0] = nums[i];
            numWithFrequency[i][1] = countMap.get(nums[i]);
        }

        Arrays.sort(numWithFrequency, (a, b) -> {
            int compare = Integer.compare(a[1], b[1]);
            if (compare == 0) {
                return Integer.compare(b[0], a[0]);
            } else {
                return compare;
            }
        });

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = numWithFrequency[i][0];
        }

        return result;
    }

}
