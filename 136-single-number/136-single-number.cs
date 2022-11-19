public class Solution {
    public int SingleNumber(int[] nums) {
        Dictionary<int, int> hs = new Dictionary<int, int>();
        for(int i = 0; i < nums.Length; i++) {
            if(hs.ContainsKey(nums[i])) {
                hs[nums[i]] = hs[nums[i]] + 1;
            }else {
               hs[nums[i]] = 1;
            }
        }
        return hs.FirstOrDefault(x => x.Value == 1).Key;

        
    }
}