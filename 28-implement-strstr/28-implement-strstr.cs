public class Solution {
    public int StrStr(string haystack, string needle) {
        if(string.IsNullOrEmpty(needle)) return 0;
        return haystack.IndexOf(needle);
    }
}