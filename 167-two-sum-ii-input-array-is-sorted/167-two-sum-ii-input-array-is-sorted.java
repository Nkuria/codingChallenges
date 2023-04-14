class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int high = numbers.length -1;
        int low = 0;
        
        while(high> low) {
            if(numbers[high] + numbers[low] > target){
               high--; 
            } else if(numbers[high] + numbers[low] < target) {
               low++; 
            }else {
                return new int[] {low + 1, high + 1};
            }
            
        }
        
        return null;
        
    }
}