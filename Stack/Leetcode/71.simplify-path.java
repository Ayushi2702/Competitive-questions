class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>(); // Initialize the stack

        String[] p = path.split("/"); // Split the path into components

        for (int i = 0; i < p.length; i++) { // Iterate through the components
            if (p[i].equals("..")) { // Check if the component is ".."
                if (!stack.isEmpty()) {
                    stack.pop(); // Pop the top element if stack is not empty
                }
            } else if (!p[i].equals("") && !p[i].equals(".")) { // Check if the component is not empty and not "."
                stack.push(p[i]); // Push the component onto the stack
            }
        }

        StringBuilder res = new StringBuilder(); // Initialize the StringBuilder

        while (!stack.isEmpty()) {
            res.insert(0, stack.pop()).insert(0, "/"); // Insert each element at the beginning
        }

       if (res.length() == 0) {
    return "/";
} else {
    return res.toString();
}

    }
}
