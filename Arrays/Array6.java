class Array6 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length/3;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer, Integer> ls=new HashMap<>();
        for(int arr:nums){
            ls.put(arr, ls.getOrDefault(arr, 0)+1);
            
        }
        for(Map.Entry<Integer, Integer> mp:ls.entrySet()){
            if(mp.getValue()>n){
                res.add(mp.getKey());
            } 
        }
        return res;
    }
}