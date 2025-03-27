
// Link of the problem -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1588583069/?envType=study-plan-v2&envId=top-interview-150


import java.util.*;
import java.io.*;
import java.lang.*;


public class BuySellStock {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int profit=0, maxProfit=0;
        int k=prices[0];

        for(int i=1;i<len;i++){
            // when price of stock is more on other days, Then we make profit

            if(prices[i]>k){
                profit=prices[i]-k;
                maxProfit = Math.max(maxProfit,profit);
            }

            // when the prices of stock is less on the buying day, we buy.
            if(prices[i]<k){
                k=prices[i];
            }
        }

        return maxProfit;
    }
}
