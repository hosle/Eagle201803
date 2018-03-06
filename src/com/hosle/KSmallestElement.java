package com.hosle;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class KSmallestElement {

    public int[] solution(int[] data,int k){
        if (k > data.length)
            return new int[]{-1};

        int start =0;
        int end = data.length-1;

        int target = partition(data,start,end);

        while(target!=k){
            if(target>k){
                end = target - 1;
            }else{
                start = target +1;
            }

            target = partition(data,start,end);
        }

        int[]result = new int[k];

        for(int i = 0;i<k;i++){
            result[i] = data[i];
        }
        return result;

    }

    private int partition(int[] data,int start,int end){
        int smallCount = 0;

        for(int i = start;i < end;i++){
            if(data[i]<data[end]){
                swap(data,i,smallCount+start);
                smallCount++;
            }
        }

        swap(data,end,smallCount+start);

        return smallCount+start;
    }

    private void swap(int[] data,int a, int b){
        if(a == b) return;

        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
