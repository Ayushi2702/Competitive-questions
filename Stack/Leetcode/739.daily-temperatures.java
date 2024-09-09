/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack  = new Stack<>();
        int[] result = new int[n];

        for(int i =0;i<n;i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek(i)])
            {
                int index = stack.pop();
                result[index] = i-index; 
            }

            stack.push(i);
        }

        return result;

    }
}
// @lc code=end

