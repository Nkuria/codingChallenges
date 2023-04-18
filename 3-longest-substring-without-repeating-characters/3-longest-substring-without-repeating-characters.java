class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<Character>();
        int max = 0;
        int i = 0;
        int j = 0;
        
        while(j < s.length()) {
            if(!chars.contains(s.charAt(j))) {
                chars.add(s.charAt(j));
                j++;
                max = Math.max(chars.size(), max);
            }else {
                chars.remove(s.charAt(i));
                i++;
            }
        }
        
        return max;
    }
}