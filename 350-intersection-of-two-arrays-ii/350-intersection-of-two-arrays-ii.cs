public class Solution {
    public int[] Intersect(int[] nums1, int[] nums2) {
        Array.Sort(nums1);
        Array.Sort(nums2);
        
        int counter1 = 0, counter2 = 0, k = 0;
        while(counter1 < nums1.Length && counter2 < nums2.Length) {
            if(nums1[counter1] < nums2[counter2]) {
                counter1++;
            }else if(nums2[counter2] < nums1[counter1]) {
                counter2++;
            }else {
                nums1[k] = nums1[counter1];
                k++;
                counter1++;
                counter2++;
            }
        }
        int[] final = new int[k];
        
        for(int i = 0; i < k; i++) {
            final[i] = nums1[i];
        }
        
        return final;
        
    }
}