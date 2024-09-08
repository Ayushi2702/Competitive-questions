/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */
Here is a complete explanation of my solution : https://leetcode.com/problems/group-anagrams/solutions/5755278/group-anagrams-easiest-explanation-youll-see
// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }

        // Create a list of grouped anagrams from the map values
        List<List<String>> result = new ArrayList<>(map.values());

        // Return the result
        return result;
    }
}

// @lc code=end

