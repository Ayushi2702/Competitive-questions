Here is the link to my explaination : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/solutions/5414465/flatten-binary-tree-to-linked-list-an-easy-approach-using-stack
/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
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
    public void flatten(TreeNode root) {
                 
        Stack<TreeNode>stack = new Stack<>();

        TreeNode cur = root;
         if(root==null)
         {
            return;
         }

         stack.push(root);

         while(!stack.isEmpty())
         {
            TreeNode current = stack.pop();
            if(current.right!=null)
            {
                stack.push(current.right);
            }
            if(current.left!=null)
            {
                 stack.push(current.left);
            } 

            if(!stack.isEmpty())
            {
                current.right=stack.peek();
            }

            current.left=null;



         }

        
    }
}
// @lc code=end

