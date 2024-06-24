My Solution to this Problem : https://leetcode.com/problems/valid-parentheses/solutions/5354987/valid-paranthesis


package Stack.Leetcode;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
         for(char c: s.toCharArray())
         { 
           if(c=='(')
             stack.push(')');

           else if(c=='{')
                stack.push('}');

            else if(c=='[')
                 stack.push(']');

            else if(stack.isEmpty() ||stack.pop()!=c )
                   return false;
         }

         return stack.isEmpty();

    }
}


