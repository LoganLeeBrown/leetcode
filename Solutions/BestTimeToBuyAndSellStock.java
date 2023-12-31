class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i + 1; j < prices.length; j++)
            {
                if(prices[j] > prices[i])
                {
                    if(prices[j] - prices[i] > profit)
                    {
                        profit = prices[j] - prices[i];
                    }
                }
                else
                {
                    i = j;
                }
            }
        }

        return profit;
    }
}