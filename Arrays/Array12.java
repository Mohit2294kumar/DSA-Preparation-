class Array12 {

    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int totalSum=0;
        int currMaxSum=0, currMinSum=0;
        int maxSum=arr[0], minSum=arr[0];
        for(int i=0; i<arr.length; i++){
            currMaxSum=Math.max(currMaxSum+arr[i], arr[i]);
            maxSum=Math.max(maxSum, currMaxSum);
            currMinSum=Math.min(currMinSum+arr[i], arr[i]);
            minSum=Math.min(minSum, currMinSum);
            totalSum+=arr[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;
        if(minSum==totalSum){
            return normalSum;
        }
        return Math.max(normalSum, circularSum);
    }
}