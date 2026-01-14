// You are given the root of a binary tree root. Invert the binary tree and return its root.
// Example 1:
// Input: root = [1,2,3,4,5,6,7]
// Output: [1,3,2,7,6,5,4]

// Example 2:
// Input: root = [3,2,1]
// Output: [3,1,2]

// Example 3:
// Input: root = []
// Output: []

/**
 * Definition for a binary tree node.
public class TreeNode {
int val;
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

import java.util.*;
class invert_binary_tree {
    public TreeNode invertTree(TreeNode root) {
        // using bfs - queue or dfs - stack
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            // swap node.left and node.right
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }   
        return root;
    }
}
