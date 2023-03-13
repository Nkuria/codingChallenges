class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> mp = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            }else {
                mp.put(c, 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(mp.containsKey(c) && mp.get(c) > 0) {
                mp.put(c, mp.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
}