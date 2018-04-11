package com.hosle.array;

public class SearchInRotateSortArray {

    public int solution(int[] nums, int target) {

//        return findInHalf(nums, 0, nums.length - 1, target);
        return solutionOnline(nums,target);
    }

    private int solutionOnline(int[]nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[start] <= nums[mid]){
                if (target < nums[mid] && target >= nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    private int findInHalf(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        if (start == end) {
            if (nums[start] == target)
                return start;
            else
                return -1;
        }

        int halfIndex = ((end - start) >> 1) + start;

        if (target == nums[halfIndex])
            return halfIndex;

        int resultLeft = findInHalf(nums, start, halfIndex - 1, target);
        int resultRight = findInHalf(nums, halfIndex + 1, end, target);

        if (resultLeft != -1)
            return resultLeft;
        else if (resultRight != -1)
            return resultRight;
        else
            return -1;
    }
}
