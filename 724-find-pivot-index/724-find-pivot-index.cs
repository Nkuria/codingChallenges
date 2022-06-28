public class Solution {
    public int PivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        foreach(int x in nums) sum = sum + x;   
        
        for(int i = 0; i < nums.Length; i++) {
            if(leftSum == sum -leftSum - nums[i] ) return i;
             leftSum += nums[i];
        }
        
        return -1;
    }
}