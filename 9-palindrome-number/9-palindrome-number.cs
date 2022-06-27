public class Solution {
    public bool IsPalindrome(int x) {
         string num = x.ToString();
        
        int j = num.Length - 1;
            
            for(int i =0; i < num.Length; i++) {
                if( j < 0) return true;    
                if(num[j] != num[i]) return false;
                j--;
            }
        
        return true;
    }
}