package com.hosle.twopointers;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 *
 * Input: [1,3,4,2,2]
 * Output: 2
 *
 * Input: [3,1,3,4,2]
 * Output: 3
 *
 * Note:
 *
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 *
 *
 */
public class DuplicateNum {

    public int solution(int nums[]){

        if(nums.length<2){
            throw new RuntimeException("nums length is not enough");
        }

        int first = nums[0];
        int second = nums[nums[0]];

        while (first != second) {
            first = nums[first];
            second = nums[nums[second]];
        }

        second = 0;

        while (first != second) {
            first = nums[first];
            second = nums[second];
        }

        return first;
    }
}
