package com.hosle.math;

/**
 * subarray-sums-divisible-by-k
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/description/?envType=daily-question&envId=2024-06-09
 *
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,0,-2,-3,1], k = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by k = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 *
 * Example 2:
 * Input: nums = [5], k = 9
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * 2 <= k <= 104
 *
 *
 * k = 5
 * nums : nums = [ 4 5 0 -2 -3 1 ]
 * prefix Sum =  [ 4 9 9 7 4 5 ]
 * remainder, prefixSum % k : p = [ 4 4 4 2 4 0 ]
 *
 *  (a + b) % k === (a % k + b % k) % k
 *  (a-b) % k ==== (a % k - b % k + k) % k, if a > b
 *  if a < b , a % k + k
 *
 *  Any subarray in nums[i] to nums[j], can be represented as p[j] - (i > 0 ? p[i - 1] : 0)
 *
 *  If a subarray nums[i] + nums[i + 1] + ... nums[j] is divisible by k, it must satisfy:
 *
 * j - i > 0 and
 * (((p[j] % k) - (i > 0 ? (p[i - 1] % k) : 0)) + k ) % k == 0 => In simplicity: p[j] % k == p[i] % k or p[j] % k == 0 if i == 0
 *
 * we use map to store the prefix sums, where each key represents a prefix sum value and its corresponding value is the number of occurrences of that particular value.
 *
 * For the current running j, if there exists an index i in our hash table such that j > i and it satisfies the above mentioned two conditions,
 *
 * we increase our result count with its correspoding (i > 0 ? p[i - 1] : 0) frequency.
 *
 * we have seen remainder = 4 , 4 times, the total combination of all sub-array is C42 = 4 x 3 / 2, so C42 + 1 = 7
 * but in the map, it accumulates the seen times of the same prefix sum. accumulationOf(remainder = 4) = 1 + 2 + 3
 *
 * there's another math equivalent theory.
 *
 * accumulation from 1 to n can be calculated as below :
 *  (n + 1 ) * n / 2 = Cn2
 *
 * In this case, we should use combination to get the result, but we can simplify it to be accumulation.
 *
 */

import java.util.*;

public class SubArraySumDivisibleByK {
    public int solution(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        Integer prefixSum = 0;
        int count = 0;
        for (Integer num : nums){
            prefixSum += num;
            Integer mod = prefixSum % k;
            if (mod <0){
                mod = mod + k;
            }
            if (map.containsKey(mod)){
                count += map.get(mod);
                map.put(mod, map.get(mod)+1);
            } else{
                map.put(mod, 1);
            }
        }
        return count;
    }
}
