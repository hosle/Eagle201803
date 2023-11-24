package com.hosle.dynamicprogramming;

import java.util.ArrayList;

/**
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

 Example 1:
 Input: [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Not 7-1 = 6, as selling price needs to be larger than buying price.

 Example 2:
 Input: [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class BuyAndSellStock {

    public int maxProfit(int[] prices){
        if(prices.length==0){
            return 0;
        }

        int[] profits = new int[prices.length];
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            profits[i]  = prices[i] - minPrice;
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }

        if(maxProfit >0){
            return maxProfit;
        }else{
            return 0;
        }
//        for(int )
    }

    public int solution(int[] prices) {
        //[7,1,5,3,6,4]
        ArrayList<Integer> profits = new ArrayList<>(prices.length);
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            int profit = prices[i] - minPrice;
            profits.set(i, profit);
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
