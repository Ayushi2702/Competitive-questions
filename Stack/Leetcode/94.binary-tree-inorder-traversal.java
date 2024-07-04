The link to my explaination is here : https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/5412151/binary-tree-inorder-traversal-an-easy-approach-using-a-stack

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode>stack = new Stack<>();
        List<Integer>output = new ArrayList<>();
        TreeNode cur = root;

        while(!stack.isEmpty() || cur!=null)
        {
            while(cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
             
            cur=stack.pop();
            output.add(cur.val);
             cur=cur.right;


        }
      
        return output;




        



        
    }
}
// @lc code=end

