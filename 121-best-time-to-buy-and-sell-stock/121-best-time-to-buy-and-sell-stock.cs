public class Solution {
    public int MaxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestValue = Int32.MaxValue;
        
        for(int i = 0; i < prices.Length; i++) {
            if(prices[i] < lowestValue) {
                lowestValue = prices[i];
            }else if(prices[i] - lowestValue > maxProfit) {
                maxProfit = prices[i] - lowestValue;
            }
        }
        
        return maxProfit;
        
    }
}