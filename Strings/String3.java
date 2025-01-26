class String3 {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> mp1=new HashMap<>();
        HashMap<Character, Integer> mp2=new HashMap<>();
        for(char i:s1.toCharArray()){
            mp1.put(i, mp1.getOrDefault(i, 0)+1);
        }
        for(char i:s2.toCharArray()){
            mp2.put(i, mp2.getOrDefault(i, 0)+1);
        }
        return mp1.equals(mp2);
    }
}