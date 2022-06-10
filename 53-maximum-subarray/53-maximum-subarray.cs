public class Solution {
    public int MaxSubArray(int[] nums) {
        int sum;
        int maxSum = 0;
        int maxLength = Int32.MinValue;
        
        for(int i = 0; i < nums.Length; i++) {
            maxSum = maxSum + nums[i];
            if(maxLength < maxSum) {
                maxLength = maxSum;
            }
            if(maxSum < 0) {
                maxSum = 0;
                
            }
        }
        
        return maxLength;
        
    }
}