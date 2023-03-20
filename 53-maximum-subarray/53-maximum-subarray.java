class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
            }else {
                currentSum = nums[i] + currentSum;
            }

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}