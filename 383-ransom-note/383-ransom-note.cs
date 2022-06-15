public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        char[] ransomArr =  ransomNote.ToCharArray();
        char[] magArr =  magazine.ToCharArray();
        for(int i = 0; i < ransomArr.Length; i++) {
            int index = Array.IndexOf(magArr, ransomArr[i]);
            if(index != -1) {
                magArr[index] = '*';   
            }else if(index == -1) {
                return false;
            }
        }
        
        return true;
    }
}