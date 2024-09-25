/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
        {
            return null;
        }

        Map<Node , Node> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        map.put(node , new Node(node.val));

        while(!queue.isEmpty())
        {
            Node curr = queue.poll();
            Node currClone = map.get(curr);

            for(Node neighbor : curr.neighbors)
            {
                if(map.containsKey(neighbor))
                {
                    map.put(neighbor , new Node(neighbor.val));
                    queue.add(neighbor);
                }

                currClone.neighbors.add(map.get(neighbor));


            }
        }
        
        return map.get(node);

    }
}
// @lc code=end

