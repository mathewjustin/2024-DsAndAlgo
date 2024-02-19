package com.codepower.striver.arrays.busellstocks;

/**
 * @author Justin Mathew @dev_io
 *
 * Unlike the first version of the problem,
 * where we need to find a single day to buy and choosing a
 * different day in the future to sell, we need to find all the
 * profit we can make.
 *
 * Basically buy and sell as many times as possible if it is profitable.
 */
public class BuyAndSellStocksII {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        System.out.println(maxProfit);
    }
}
