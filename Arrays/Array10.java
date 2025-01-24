class Array10 {

    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        int n=arr.length;
        int res=arr[0];
        int maxEnd=arr[0];
        for(int i=1; i<n; i++){
            maxEnd=Math.max(maxEnd+arr[i], arr[i]);
            res=Math.max(res, maxEnd);
        }
        return res;
    }
}