class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if(mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            }else {
                mp.put(c, 1);
            }
        }
        
        for(int i=0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if(mp.containsKey(c) && mp.get(c) > 0) {
                mp.put(c, mp.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
}