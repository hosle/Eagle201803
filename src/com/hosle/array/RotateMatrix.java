package com.hosle.array;

/**
 * Created by tanjiahao on 2018/3/7.
 * Eagle201803
 */
public class RotateMatrix {

    public int[][] solution(int[][] matrix){
        int n = matrix.length;

        int start = 0;
        int end = n-1;

        while(n>0) {

            for (int i = 0; i < n - 1; i++) {
                clockwiseByOne(matrix, n, start, end);
            }

            n = n - 2;
            ++start;
            --end;
        }

        return matrix;

    }

    private void clockwiseByOne(int[][] matrix, int n,int start,int end){
        if(n == 1)
            return ;

        int startCell = matrix[start][start];


        //left
        for(int i = start;i<end;i++){
            matrix[i][start] = matrix[i+1][start];
        }

        //bottom
        for(int i = start;i<end;i++){
            matrix[end][i] = matrix[end][i+1];
        }

        //right
        for(int i = end;i>start;i--){
            matrix[i][end] = matrix[i-1][end];
        }

        //top
        for(int i = end;i>start+1;i--){
            matrix[start][i] = matrix[start][i-1];
        }

        matrix[start][start+1] = startCell;
    }

}
