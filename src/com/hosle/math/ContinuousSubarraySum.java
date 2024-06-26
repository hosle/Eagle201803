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

// i             i+1
// a[i]%k!=0     a[i+1]%k == 0 , true,   map.get(0) >= 1,
// a[i]%k    ==  a[i+1]%k ,      false,  map.get(x) == 2, mod(i) == mod(i+1) == x
// a[i]%k==0     a[i+1]%k == 0 , true,   map.get(0) == 2
// a[j]%k == 0, j>0,             true,   map.get(0) == 1
// a[0]%k == 0, a[1]%k != 0,     false,  map.get(0) == 1,

public class ContinuousSubarraySum {
    public boolean solution(int[] nums, int k) {

        int preSum = 0;
        HashMap<Integer, Integer> remainders = new HashMap<Integer, Integer>();

        if (k == 0){
            for (int i = 1; i<nums.length;i++){
                if (nums[i] == 0 && nums[i-1] == 0){
                    return true;
                }
            }
            return false;
        }
        //a[0]%k == 0, a[1]%k != 0
        if (nums[0]%k != 0) {
            // a[i]%k!=0     a[i+1]%k == 0 , true,   map.get(0) >= 1,
            remainders.put(0, 1);
        }

        int preRemainder = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            preSum += nums[i];
            int remainder = preSum % k;

            if (remainders.containsKey(remainder) && remainders.get(remainder) > 0){
                if (preRemainder==remainder) {
                    if (remainder == 0) {
                        return true;
                    } else {
                        continue;
                    }
                } else {
                    return true;
                }
            }
            if (preSum > k || remainder == 0) {
                remainders.put(remainder, remainders.getOrDefault(remainder, 1));
            }
            preRemainder = remainder;
        }
        return false;

    }
}
