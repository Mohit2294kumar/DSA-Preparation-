class Array5 {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int i=n-2;
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i+1, n-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int arr[], int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}