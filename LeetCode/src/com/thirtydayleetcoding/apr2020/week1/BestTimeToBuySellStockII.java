package com.thirtydayleetcoding.apr2020.week1;

public class BestTimeToBuySellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int profit = 0;

        int buyPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < prices[i - 1]) {
                profit += (prices[i - 1] - buyPrice);
                buyPrice = prices[i];
            }
        }

        profit += (prices[prices.length - 1] - buyPrice);

        return profit;
    }
}
