public class Solution {
    public bool IsValid(string s) {
        Stack my_stack = new Stack();
 
        for(int i = 0; i < s.Length; i++) {
            if( s[i].Equals( '(' ) || s[i].Equals( '{' ) || s[i].Equals( '[' )) my_stack.Push(s[i]);
            else if(s[i].Equals( ')' )) {
                if(my_stack.Count == 0 || !my_stack.Peek().Equals( '(' ) ) return false;
                else my_stack.Pop();
            } else if(s[i].Equals( '}' )) {
                if(my_stack.Count == 0  ||  !my_stack.Peek().Equals( '{' ) ) return false;
                else my_stack.Pop();
            } else if(s[i].Equals( ']' )) {
                if(my_stack.Count == 0 || !my_stack.Peek().Equals( '[' ) ) return false;
                else my_stack.Pop();
            }
                    
            
        }
        
        if(my_stack.Count == 0) return true;
        else return false;
     
        
    }
}