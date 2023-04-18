class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == ' ') {
                reverse(arr, i, j -1);
                i = j + 1;
            }
        }
        reverse(arr, i, arr.length - 1);
        return new String(arr);
    }
    
    public void reverse(char[] s, int l, int r) {
        while(l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}