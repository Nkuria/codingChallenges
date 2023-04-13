class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        
        while(left < n && nums[left] < 0) {
            left++;
        }
        
        int right = left - 1;
        int[] final_arr = new int[n];
        int counter = 0;
        
        while(left < n && right >= 0){
            
            if(nums[left] * nums[left] > nums[right] * nums[right]) {
                final_arr[counter] = nums[right] * nums[right];
                    right -=1;
            }else {
                final_arr[counter] = nums[left] * nums[left];
                    left +=1;
            }
            counter+=1;
        }
        
        while(left < n) {
            final_arr[counter] = nums[left] * nums[left];
            left +=1;
            counter +=1;
        }
        
        while(right >= 0) {
            final_arr[counter] = nums[right] * nums[right];
            right -=1;
            counter +=1;
        }
        
        return final_arr;
        
    }
}