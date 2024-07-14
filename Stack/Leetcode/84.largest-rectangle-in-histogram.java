/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

here is my explaination to the problem : https://leetcode.com/problems/largest-rectangle-in-histogram/solutions/5474169/largest-rectangle-in-histogram-easy-explaination-through-images/

// @lc code=start
import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            
            while (!s.isEmpty() && currHeight < heights[s.peek()]) {
                int top = s.pop();
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(area, maxArea);
            }
            
            s.push(i);
        }
        
        return maxArea;
    }
}

// @lc code=end

