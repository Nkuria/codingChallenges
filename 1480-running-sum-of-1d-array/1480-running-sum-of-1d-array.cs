public class Solution {
    public int[] RunningSum(int[] nums) {
        int[] final = new int[nums.Length];
        
        final[0] = nums[0];
        
        for(int i = 1; i < nums.Length; i++) {
            final[i] = final[i - 1] + nums[i];
        }
        
        return final;
        
    }
}