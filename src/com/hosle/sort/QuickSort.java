package com.hosle.sort;

import java.util.ArrayList;

/**
 https://www.geeksforgeeks.org/quick-sort/?ref=lbp

 Worst Case:
 T(n) = T(0) + T(n-1) + \theta(n)
 which is equivalent to
 T(n) = T(n-1) + O(n)

 O(N^2)

 Best Case :
 T(n) = 2T(n/2) + O(n)

 O(nlogN)

 How to calculate the time complexity
 https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)
 */
public class QuickSort {

    public Integer[] solution(ArrayList<Integer> origin){

        if (null == origin || origin.size() == 0) {
            return new Integer[0];
        }

        quickSort(origin,0,origin.size()-1);

        return origin.toArray(new Integer[origin.size()]);
    }

    private void quickSort(ArrayList<Integer> origin, int start,int end){
        if (start >= end)
            return;

        int midPos = partition(origin, start, end);

        quickSort(origin, start, midPos - 1);
        quickSort(origin, midPos + 1, end);

    }

    private int partition(ArrayList<Integer> origin,int start,int end){
//        int midPos = end;
        int midCount = start;

        for (int i = start; i < end; i++) {
            if (origin.get(i) <= origin.get(end)) {
                swap(origin, i, midCount);
                ++midCount;
            }
        }

        swap(origin,end,midCount);

        return midCount;
    }

    private void swap(ArrayList<Integer> origin,int a,int b){
        if(a == b){
            return;
        }

        int temp = origin.get(a);
        origin.set(a,origin.get(b));
        origin.set(b,temp);
    }
}
