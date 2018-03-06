package com.hosle.array;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 *
 *
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 */
public class MoveZeros {

    public void solution(int[] nums){
        int size = nums.length;

        if(size <=0) return;

        int notZeroCount=0;

        for(int i = 0;i<size;i++){
            if(nums[i] != 0){
                if(i>notZeroCount){
                    nums[notZeroCount] = nums[i];
                    nums[i] = 0;
                }
                ++notZeroCount;
            }
        }
    }
}
