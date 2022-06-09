class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] finalArr = new int[nums.length]; 
            for(int i = 0; i < nums.length; i++) {
                finalArr[i] = nums[i] * nums[i];
            }
        
        //Bubble sort
        for(int i = 0; i < finalArr.length; i++) {
            boolean swapped = false;
            for(int j = 0; j < finalArr.length - 1 - i; j++) {
                if(finalArr[j] > finalArr[j+1]) {
                    int temp = finalArr[j];
                    finalArr[j] = finalArr[j+1];
                    finalArr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        
        return finalArr;
    }
}