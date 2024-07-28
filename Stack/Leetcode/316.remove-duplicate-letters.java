/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastOccurence[s.charAt() - 'a'] = i;
        }

        Stack <Character> stack = new Stack<>();

        boolean[] inStack = new Boolean[26];

        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt();


            if(inStack[c-'a'] == true)
            {
                continue;
            }


            while(!stack.isEmpty() && stack.peek()>c && lastOccurrence[stack.peek() - 'a']>i)
            {
               inStack[stack.pop() - 'a'] =false;
            }

            stack.push(c);
            inStack(c - 'a') =true;
        }

      StringBuilder result = new StringBuilder();
      for(char c:stack)
      {
        result.append(c);
      }

      return result.toString();








    }
}
    }
}
// @lc code=end

