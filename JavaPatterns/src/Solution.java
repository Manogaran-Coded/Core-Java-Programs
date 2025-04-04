import java.util.*;

public class Solution {

    // Method for zigzag level order traversal
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Handle empty tree
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Initialize queue and result
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        // Process nodes level by level
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            // Process all nodes in the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                // Add children to queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Reverse level if odd-numbered
            if (level % 2 != 0) {
                Collections.reverse(currentLevel);
            }

            // Add the current level to the result
            result.add(currentLevel);

            // Move to the next level
            level++;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a binary tree to test
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Create an instance of Solution
        Solution solution = new Solution();

        // Get the zigzag level order traversal
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}