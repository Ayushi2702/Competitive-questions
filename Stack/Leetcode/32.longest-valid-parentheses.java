/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */
Link to the first Approach : https://leetcode.com/problems/longest-valid-parentheses/solutions/5360440/longest-valid-parenthesis-approach-1

Link to the second Approach : https://leetcode.com/problems/longest-valid-parentheses/solutions/5360566/longest-valid-parenthesis-approach-2

//first approach 

class Solution2 {
    public int longestValidParentheses(String s) {
  Stack<Integer>stack= new Stack<>();
  stack.push(-1);
  int max=0;

  for(int i=0;i<s.length();i++)
  {
    char c= s.charAt(i);

    if(c=='(')
    {
        stack.push(i);
    }

    else{
        stack.pop();
        if(stack.isEmpty())
        {
            stack.push(i);
        }
        else{
            int l=i-stack.peek();
            max=Math.max(max,len);
        }
    }
  }

return max;

    }

//second approach
// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
       int max=0;
       //0--n
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
         
        if(c=='(')
        {
            open++;
        }
        else{
            close++;
        }

        if(open==close)
        {
            int len=open+close;
            max=Math.max(max,len);
        }
        else if(close>open)
        {
            open=close=0;
        }
    }

    open=close=0;

    //n--0

    for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
         
        if(c=='(')
        {
            open++;
        }
        else{
            close++;
        }

        if(open==close)
        {
            int len=open+close;
            max=Math.max(max,len);
        }
        else if(open>close)
        {
            open=close=0;
        }
    }
       return max;


    }
}
// @lc code=end
