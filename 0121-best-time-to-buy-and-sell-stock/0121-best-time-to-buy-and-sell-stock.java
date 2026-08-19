class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int bestbuy = prices[0];
        int res = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > bestbuy){
                res = Math.max(res, prices[i] - bestbuy);
            }
            bestbuy = Math.min(bestbuy, prices[i]);
        }
        return res;
    }
}