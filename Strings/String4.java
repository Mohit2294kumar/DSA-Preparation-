class String4 {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
       
        HashMap<Character, Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        for(char ch:s.toCharArray()){
            if(mp.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }
}