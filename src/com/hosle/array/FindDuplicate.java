package com.hosle.array;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 * <p>
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindDuplicate {

    /*
    * Suppose the first meet at step k,the length of the Cycle is r. so…2k-k=nr,k=nr
    *
    *  the distance between the start node of list and the start node of cycle is s
    *  the distance between the start node of cycle and the first meeting node is m
    *
    *  so… s+m=k
    *
    *  first loop: k=nr, meet a node which is m from the entry of the cycle
     * second loop :  s=nr-m,let n = 1, when pointer begin from m and pointer begin at start must meet at the entry
    * */
    public int solution(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;

    }
}
















