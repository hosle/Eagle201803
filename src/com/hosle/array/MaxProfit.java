package com.hosle.array;

/**
 * Created by tanjiahao on 2018/3/6.
 * Eagle201803
 */
public class MaxProfit {

    public int solution(int[] prices) {
        if(prices.length==0) return 0;

        int start = prices[0];

        int profitSum = 0;

        for(int i = 0;i<prices.length;i++){
            if (i + 1 >= prices.length || prices[i] > prices[i + 1]) {
                profitSum += (prices[i] - start);

                if(i<prices.length-1){
                    start = prices[i+1];
                }
            }
        }

        return profitSum;
    }
}
