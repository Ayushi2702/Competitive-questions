/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        
 int left=0;
 int right=height.length-1;
int leftmax = 0;
int rightMax = 0;
int waterTrapped=0;

     while(left<=right)
     {
        if(height[left]<=height[right])
        {
              
            if(height[left]>=leftMax)
            {
                leftMax = height[left];
            }//inner if

            else{
                waterTrapped +=leftMax - height[left];
            }
            left++;
              



         }//outer if
            
         else{   
            if(height[right]>=rightMax)
            {
                      rightMax = height[right];


            }

            else{
                waterTrapped +=rightMax - height[right];
            }

            right--;
                   


         }//else





     }//while


     return waterTrapped














    }//function
}//class
// @lc code=end

