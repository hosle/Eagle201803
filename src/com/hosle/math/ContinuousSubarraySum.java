package com.hosle.math;

/**
 * https://leetcode.com/problems/continuous-subarray-sum/description/?envType=daily-question&envId=2024-06-09
 * <p>
 * Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
 * <p>
 * A good subarray is a subarray where:
 * <p>
 * its length is at least two, and
 * the sum of the elements of the subarray is a multiple of k.
 * Note that:
 * <p>
 * A subarray is a contiguous part of the array.
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [23,2,4,6,7], k = 6
 * Output: true
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 * Example 2:
 * <p>
 * Input: nums = [23,2,6,4,7], k = 6
 * Output: true
 * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
 * 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
 * Example 3:
 * <p>
 * Input: nums = [23,2,6,4,7], k = 13
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 * 0 <= sum(nums[i]) <= 231 - 1
 * 1 <= k <= 231 - 1
 */

import java.util.*;

public class ContinuousSubarraySum {
    public boolean solution(int[] nums, int k) {

        if (nums.length <= 1){
            return false;
        }

        int preSum = 0;
        HashMap<Integer, Integer> remainders = new HashMap<Integer, Integer>();
//        remainders.put(0, 1);

        for (int num : nums) {
            preSum += num;
            int remainder = preSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (remainder == 0 && preSum > num){
                return true;
            }

            if (remainders.containsKey(remainder)) {
                if (remainders.get(remainder) > 0) {
                    return true;
                }

                remainders.put(remainder, remainders.get(remainder) + 1);
            } else {
                remainders.put(remainder, 1);
            }
        }
        return false;
    }
}
