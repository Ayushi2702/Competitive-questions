/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
         if(height.length==0)
         {
            return 0;
         }

         int left = 0;
         int right = height.length-1;
         int maxArea = 0;

         while(left<right)
         {
          int width = right - left;
          int currentHeight = Math.min(left,right);

          int area = width*currentHeight;

          maxArea = Math.max(maxArea , area);

          if(height[left] < height[right])
          {
            left++;
          }

          else{
            right--;
          }


         }
         
     return maxArea;


    }
}
// @lc code=end

