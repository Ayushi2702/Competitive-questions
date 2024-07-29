/*
 * @lc app=leetcode id=1963 lang=java
 *
 * [1963] Minimum Number of Swaps to Make the String Balanced
 */

// @lc code=start
class Solution {
    public int minSwaps(String s) {
        
        int maxImbalance = 0;
        int imbalance = 0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt();

            if(c=='[')
            {
                imbalance--;
            }

            else{
                imbalance++;
            }

            maxImbalance = Math.max(maxImbalance,imbalance);

        }

        return (maxImbalance+1)/2;
    }
}
// @lc code=end

//end