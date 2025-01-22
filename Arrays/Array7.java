class Array7 {
    public int maximumProfit(int prices[]) {
        // code here
        int n=prices.length;
        int res=0;
        for(int i=1; i<n; i++){
            if(prices[i]>prices[i-1]){
                res+=(prices[i]-prices[i-1]);
            }
        }
        return res;
    }
}