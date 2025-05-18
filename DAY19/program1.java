// DSA based 
// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;  
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
             {
                top++;  
                stack[top] = ch; 
            } 
            else if (ch == ')' || ch == '}' || ch == ']') 
            {
                if (top == -1)
                 {
                    return false;
                }
                char last = stack[top];
                if ((ch == ')' && last != '(') || 
                    (ch == '}' && last != '{') || 
                    (ch == ']' && last != '[')) {
                    return false;  // Mismatch in the brackets
                }
                
                top--;  // Pop the matching opening bracket from the stack
            }
        }
        
        // If the stack is empty at the end, the string is valid
        return top == -1;
    }
}
