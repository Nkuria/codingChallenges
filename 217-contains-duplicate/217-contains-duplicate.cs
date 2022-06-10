public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> hash = new HashSet<int>();
    
               for(int i = 0; i < nums.Length; i++) {
            if(hash.Add(nums[i]) == false) {
                return true;
            };
    
        }
     
            
                return false;
            
      
        
    }
}