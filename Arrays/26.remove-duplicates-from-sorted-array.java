/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;

        int unique = 0;

        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[unique])
            {
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique+1;
    }
}
// @lc code=end

