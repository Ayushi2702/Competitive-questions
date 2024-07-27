/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

// @lc code=start

here  is my explaination to it : https://leetcode.com/problems/binary-tree-postorder-traversal/solutions/5544959/binary-tree-postorder-traversal-easy-explaination

import java.util.LinkedList;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer>output = new LinkedList<>();

Stack<TreeNode>stack = new Stack<>();
if(root==null)
{
    return output;                            //left-right-root
}
     stack.push(root);
         
     while(!stack.isEmpty())
     {
        TreeNode current = stack.pop();

        output.addFirst(current.val);
        if(current.left!=null)
        {
            stack.push(current.left);
        }

        if(current.right!=null)
        {
            stack.push(current.right);
        }
     }

     return output;

        
    }
}
// @lc code=end

