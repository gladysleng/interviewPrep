package com.company;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int total =0;
        for(int i = 1;  i < prices.length;  i++ ){
            if(prices[i-1] < prices[i]){
                total += prices[i]- prices[i-1];
            }

        }
        return total;
    }
}
