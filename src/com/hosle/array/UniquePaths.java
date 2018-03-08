package com.hosle.array;

import java.util.HashMap;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class UniquePaths {



    public int solution(int m,int n) {

        int[][] pathCount = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0){
                    pathCount[i][j] = 1;
                }else{
                    pathCount[i][j] = pathCount[i-1][j]+pathCount[i][j-1];
                }
            }
        }


        return pathCount[m-1][n-1];

    }
}
