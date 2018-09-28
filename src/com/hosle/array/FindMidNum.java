package com.hosle.array;

import java.util.ArrayList;
import java.util.HashSet;

public class FindMidNum {

    public int solution(int[] input){

        if(input.length == 0){
            return -1;
        }else if(input.length ==1){
            return input[0];
        }

        return findMid(input,0,input.length-1);
    }

    private int findMid(int[] input, int start, int end){

        if (end < start) {
            return -1;
        }

        int mid = partition(input,start,end);

        int realMid = (input.length>>1);

        if (mid == realMid) {
            return input[mid];
        } else if (mid < realMid) {
            return findMid(input, mid + 1, end);
        } else {
            return findMid(input, start, mid - 1);
        }
    }

    private int partition(int[] input,int start,int end){
        if(start == end)
            return start;
        else if(start>end){
            return -1;
        }

        int smallerPosCount = start;

        for (int i = start; i < end; i++) {
            if (input[i] <= input[end]) {
                swap(input, i, smallerPosCount);
                smallerPosCount++;
            }
        }
        swap(input, end, smallerPosCount);

        return smallerPosCount;
    }

    private void swap(int[] data,int a,int b){
        if(data[a] == data[b])
            return;
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
