package com.hosle.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses have security systems connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {
    public int solution(int[] input){
        // 2 7 9 3 1
        //f(n) = max (F(n-2) + n , F(n-1))
        if (input.length == 1) {
            return input[0];
        } else if (input.length <= 2) {
            return Math.max(input[0], input[1]);
        }

        ArrayList<Integer> sumArray = new ArrayList<>(Arrays.asList(new Integer[input.length]));
        sumArray.set(0, input[0]);
        sumArray.set(1, input[1]);

        for (int i = 2; i < input.length; i++) {
            int sumMax = Math.max(sumArray.get(i - 2) + input[i], sumArray.get(i - 1));
            sumArray.set(i, sumMax);
        }

        return Math.max(sumArray.get(input.length-1), sumArray.get(input.length-2));
    }
}
