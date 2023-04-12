class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int final_mid = 0;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            
            if(nums[mid] == target) return mid;
            // if(nums[mid] < target && nums[mid + 1] > target) return mid;
            
            if(nums[mid] < target) {
                low = mid + 1;
                final_mid = mid + 1;
            }else {
                high = mid - 1;
                final_mid = mid;
            }
        }
        return final_mid;
    }
}