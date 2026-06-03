class Solution {
    public int maxProfit(int[] prices) {
        int start = 0; // min
        int end = 0;  // max
        int result = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[start] > prices[i]) {
                start = i;
                end = i;
            }
            if (prices[end] < prices[i]) {
                end = i;
            }
            result = Math.max(result, prices[end]-prices[start]);
        }
        return result;
        
    }
}
