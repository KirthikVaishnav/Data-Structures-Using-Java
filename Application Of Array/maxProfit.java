class Solution {
    public int maxProfit(int[] prices) {
        int bind=0;
        int sell=0;
        if(prices.length==1)return 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[bind]>prices[i])
            {
                bind=i;
            }
            else if(prices[i] >prices[bind])
            {
                sell = Math.max(sell,prices[i]-prices[bind]);
            }
        }
         return sell;  
    }
}
