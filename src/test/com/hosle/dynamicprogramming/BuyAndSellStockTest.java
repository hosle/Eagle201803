package com.hosle.dynamicprogramming;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyAndSellStockTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
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