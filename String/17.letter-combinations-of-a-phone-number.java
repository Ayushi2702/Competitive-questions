/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {

    private static final Map<Character , String> phoneMap = new HashMap<>();
    static{
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
    }
   
public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();

    if(digits==null || digits.length()==0)
    {
        return result;
    }
    backtrack(result , new StringBuilder() , 0 , digits);
    return result;
        
    }
  private void backtrack(List<String>result , StringBuilder combination , int index , String digits)
  {
     if(index==digits.length())
     {
         result.add(combination.toString());
         return;
     }

     char d = digits.charAt(index);
     String letters = phoneMap.get(d);

     for(char l : letters.toCharArray())
     {
           combination.append(l);
           backtrack(result , combination,index+1 , digits);
           combination.deleteCharAt(combination.length()-1);

     }



  }




}
// @lc code=end

