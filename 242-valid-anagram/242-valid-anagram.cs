public class Solution {
    public bool IsAnagram(string s, string t) {
        char[] ss = s.ToCharArray();
        char[] tt = t.ToCharArray();
        
        Array.Sort(ss);
        Array.Sort(tt);
        
        if(ss.Length != tt.Length) return false;
        
        for(int i = 0; i < tt.Length; i++) {
            if(ss[i] != tt[i]) return false;
        }
        
        return true;
        
    }
}