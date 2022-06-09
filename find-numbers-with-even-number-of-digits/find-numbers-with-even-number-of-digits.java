class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            System.out.println(num);
            if(num.length()%2 == 0) {
                counter++;
            }
        }

        return counter;
        
    }
}