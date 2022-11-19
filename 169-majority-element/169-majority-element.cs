public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int, int> hs = new Dictionary<int, int>();

        for(int i = 0; i < nums.Length; i++) {
            if(hs.ContainsKey(nums[i])) {
                hs[nums[i]] = hs[nums[i]] + 1;
            }else {
                hs[nums[i]] = 1;
            }

            if(hs[nums[i]] > (nums.Length / 2)) {
                return nums[i];
            }
        }
        return 0;
    }
}