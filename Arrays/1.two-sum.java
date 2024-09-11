/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
             
        Map<Integer, Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {  
            int num = nums[i];
            int complement = target - num;

            if(map.containsKey(compelment))
            {
                return new int[] { map.get(complement) , i};
            }

            map.put(i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
}
// @lc code=end

