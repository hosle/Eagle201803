package com.hosle.array;

public class SortColors {
    public void solution(int[] nums){

        quickSort(nums,0,nums.length-1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if(start >= end)
            return;

        int mid = partition(nums, start, end);

        quickSort(nums, start, mid - 1);
        quickSort(nums, mid + 1, end);
    }

    private int partition(int[]nums,int start,int end){
        int smallCount = start;

        for(int i = start; i< end;i++){
            if(nums[i]<=nums[end]){
                swap(nums,smallCount,i);
                smallCount++;
            }
        }

        swap(nums,end,smallCount);

        return smallCount;
    }

    private void swap(int[]nums,int a,int b){
        if(a==b)
            return;
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }



}
