public class Solution {
    public bool IsPalindrome(int x) {
         string num = x.ToString();
        
        int j = num.Length - 1;
            
//             for(int i =0; i < num.Length; i++) {
//                 if( j < 0) return true;    
//                 if(num[j] != num[i]) return false;
//                 j--;
//             }
        
        int i = 0;
        while(i < num.Length && j >= 0) {
                if( j < 0) return true;   
                if(num[j] != num[i]) return false;
            j--;
            i++;
            
            
        }
        
        return true;
    }
}