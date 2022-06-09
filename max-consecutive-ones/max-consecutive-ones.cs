public class Solution {
    public int FindMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxValue = 0;
        List<int> list = new List<int>();
    
        for(int i = 0; i < nums.Length; i++) {
            if(nums[i] == 0) {
                counter = 0;
            }else{
               counter++;
                if(counter > maxValue) {
                    maxValue = counter;
                }
            }
            
        }
        
//     int maxValue = 0;
        
  
        return maxValue;
        
    }
}