package com.hosle.dynamicprogramming;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyAndSellStockTest {

    @AfterAll
    public void tearDown() throws Exception {
    }

    @Test
    public void maxProfit() {

        int[] prices = new int[]{7,1,5,3,6,4};

        assertEquals(5,new BuyAndSellStock().maxProfit(prices));
    }

    @Test
    public void maxProfit2() {

        int[] prices = new int[]{7,6,4,3,1};

        assertEquals(0,new BuyAndSellStock().maxProfit(prices));
    }
}