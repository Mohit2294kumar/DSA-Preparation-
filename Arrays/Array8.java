class Array8 {
    public int maximumProfit(int prices[]) {
       
        int n=prices.length;
        int minPrices=prices[0];
        int res=0;
        for(int i=1; i<n; i++){
            minPrices=Math.min(minPrices, prices[i]);
            res=Math.max(res, prices[i]-minPrices);
        }
        return res;
    }
}