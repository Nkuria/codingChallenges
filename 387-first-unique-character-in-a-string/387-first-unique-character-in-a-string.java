class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i) )) {
                hm.replace(s.charAt(i), hm.get(s.charAt(i))+ 1);
            }else {
                hm.put(s.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}