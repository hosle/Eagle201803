package com.hosle.array;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 *

 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 */
public class MajorityElement {

    public int solutionRobustFast(int[] nums){
        int curNum = nums[0];
        int numCount = 1;

        for(int i = 1;i<nums.length;i++){
            if(numCount<=0) {
                curNum = nums[i];
                numCount++;
            }else{
                if (nums[i] == curNum) {
                    numCount++;
                } else {
                    numCount--;
                }
            }
        }

        return curNum;
    }

    public int solution(int[] nums) {

        int targetIndex = nums.length >> 1;

        int start =0;
        int end =  nums.length -1;

        int middle = partition(nums,start,end);

        while(middle!=targetIndex){
            if(middle>targetIndex){
                end = middle -1;
            }else{
                start = middle +1;
            }

            middle = partition(nums,start,end);
        }

        int result = nums[middle];

        if(checkIsMajority(nums,result)){
            return result;
        }else{
            return -1;
        }
    }

    private int partition(int[] nums,int start,int end){
        int smallCount = 0;

        for (int i = start; i < end; i++) {
            if (nums[i] <= nums[end]) {
                swap(nums, smallCount + start, i);
                smallCount++;
            }
        }
        swap(nums, smallCount + start, end);

        return smallCount + start;
    }

    private void swap(int[] data,int a, int b){
        if(a==b) return;

        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private boolean checkIsMajority(int[] nums,int target){
        int count = 0;
        for (int item : nums) {
            if (item == target) {
                count++;
            }
        }
        return count * 2 > nums.length;
    }
}
