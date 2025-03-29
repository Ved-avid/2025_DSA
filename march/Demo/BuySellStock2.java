
// Question Link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int n= prices.length;
        int[] maxProfit = new int[n];
        maxProfit[0] = 0; // profit on first day is zero

        for(int i=1;i<n;i++){
            maxProfit[i] = Math.max(maxProfit[i-1],maxProfit[i-1]+prices[i]-prices[i-1]);
        }
        return maxProfit[n-1];
    }
}
