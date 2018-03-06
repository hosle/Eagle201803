package com.hosle;

/**
 * Created by tanjiahao on 2018/3/2.
 * Eagle201803
 */
public class SelectMostElement {

    public int solution(int[] data){

        int midIndex = data.length >> 1;
        int start = 0;
        int end = data.length-1;
        int targetIndex = partition(data,start,end);
        int result ;

        while(targetIndex != midIndex){

            if(targetIndex > midIndex){
                end = targetIndex - 1;
            }else{
                start = targetIndex + 1;
            }

            targetIndex = partition(data,start,end);
        }
        result = data[targetIndex];

        if (!checkIfHalf(data, result)) {
            result = -1;
        }

        return result;
    }

    public int partition(int[]data,int start,int end){

        int smallerCount = 0;

        for(int i = start; i<end;i++){
            if(data[i]<= data[end]){
                swap(data, i, smallerCount+start);
                ++smallerCount;
            }
        }

        swap(data,smallerCount+start,end);

        return smallerCount+start;
    }

    private void swap(int[]data,int a,int b){
        if(a == b) return;
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private boolean checkIfHalf(int[]data,int result){
        int count = 0;

        for(int item : data){
            if(result == item){
                ++count;
            }
        }

        return count*2>=data.length;
    }
}
