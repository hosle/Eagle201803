package com.hosle.backtracking;

/**
 * Created by tanjiahao on 2018/3/5.
 * Eagle201803
 */
public class CharactersPermutation {

    public void solution(String dataString){

        if(null==dataString)
            throw new IllegalArgumentException("dataString is null");

        String[] data = dataString.split("");

        printArrangement(data,0);

    }

    private void printArrangement(String[] data, int start){
        if(start == data.length-1){
            for(String item :data){
                System.out.print(item);
            }
            System.out.println();
            return;
        }

        for(int i = start;i<data.length;i++){
            swap(data,start,i);
            printArrangement(data,start+1);
            swap(data,start,i);
        }
        System.out.println();

    }

    private void swap(String[] data,int a,int b){
        if(a == b) return;

        String temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
