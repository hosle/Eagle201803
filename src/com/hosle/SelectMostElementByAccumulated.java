package com.hosle;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class SelectMostElementByAccumulated {

    public int solution(int[]data){

        int count = 0;
        int currentData = data[0];

        for (int aData : data) {
            if (count == 0) {
                currentData = aData;
            }

            if (aData == currentData) {
                count++;
            }else{
                count--;
            }
        }

        return checkIfHalf(data,currentData)?currentData:-1;

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
