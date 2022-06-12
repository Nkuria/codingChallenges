public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] final = new int[2];
        for(int i  = 0; i < nums.Length; i++) {
            for(int j = 0; j < nums.Length; j++) {
                if(nums[j] + nums[i] == target && j != i) {
                    final[0] = i;
                    final[1] = j;
                }
            }
           
        }
         return final;
        
    }
}