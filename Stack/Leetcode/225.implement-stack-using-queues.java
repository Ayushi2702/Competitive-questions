/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start

import java.util.Queue;

class MyStack {
    
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;


    public MyStack() {
        
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue2.add(val);
        while(!queue1.isEmpty())
        {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    
    public int pop() {
        if(!queue1.isEmpty())
        {
            return queue1.remove();
        }
    }
    
    public int top() {
        if (!queue1.isEmpty()) {
            
            return queue1.peek();
        }
    }
    
    public boolean empty() {
        if (queue1.isEmpty()) {
             return false;

        }
        else{
            return true;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

