/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

Here is my  detailed explanation : https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/5729939/longest-substring-without-repeating-characters-easiest-explaination-you-ll-see 

import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
    Map<Character, Integer> charIndexMap = new HashMap<>();

    int maxLength =0;
    int start=0;

    for(int end=0;end<s.length();end++)
    {
        char current = s.charAt(end);

        if(charIndexMap.containsKey(current) && charIndexMap.get(current)>=start)
        {
            start = charIndexMap.get(current) +1;
        }

        charIndexMap.put(current,end);
        maxLength = Math.max(maxLength , end-start+1);
    }

    }
}
// @lc code=end

