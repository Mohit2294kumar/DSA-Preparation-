class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
       
        int n=arr.length;
        int maxProd=Integer.MIN_VALUE;
        int lR=1;
        int rL=1;
        for(int i=0; i<n; i++){
            if(lR==0)
                lR=1;
            if(rL==0)
                rL=1;
            
            lR*=arr[i];
            int j=n-i-1;
            rL*=arr[j];
            maxProd=Math.max(lR, Math.max(rL, maxProd));
        }
        return maxProd;
    }
}