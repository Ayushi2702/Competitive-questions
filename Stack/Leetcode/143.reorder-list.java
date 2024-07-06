/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
         
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        
        while(temp!=null)
        {
            stack.push(temp);
            temp=temp.next;
        }       

        int n = stack.size();
        temp=head;

        for(int i=0;i<n/2;i++)
        {
            ListNode nextNode = temp.next;
            ListNode last = stack.pop();

            temp.next=last;
            last.next=nextNode;
            temp=nextNode;
        }
         
        temp.next=null;

    }
}
// @lc code=end

