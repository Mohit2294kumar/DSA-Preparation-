class Array13 {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n=arr.length;
        boolean vis[]=new boolean[n];
        for(int i=0; i<n; i++){
            if(arr[i]>0&&arr[i]<=n){
                vis[arr[i]-1]=true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!vis[i-1]){
                return i;
            }
        }
        return n+1;
    }
}