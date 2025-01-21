class Array1{
    public int getSecondLargest(int[] arr) {
        
        int largest=-1;
        int secondLargest=-1;
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }else if(secondLargest<arr[i]&&largest>arr[i]){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}