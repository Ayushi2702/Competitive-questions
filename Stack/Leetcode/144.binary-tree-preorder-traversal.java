/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

here is my explaination : https://leetcode.com/problems/binary-tree-preorder-traversal/solutions/5502745/binary-tree-preorder-traversal

// @lc code=start

import java.util.Stack;

import javax.swing.tree.TreeNode;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode>stack = new Stack<>();
        List<Integer>output = new ArrayList<>();
        if(root==null)
        {
            return output;
        }
      stack.push(root);

      while(!stack.isEmpty()){
        TreeNode current = stack.pop();
        output.add(current.val);

        if(current.right!=null)
        {
            stack.push(current.right);
        }

        if(current.left!=null)
        {
            stack.push(current.left);
        }
      }//while ends here
     return output;
    }//function ends
}//class ends
// @lc code=end

