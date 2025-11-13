import javax.swing.tree.TreeNode;

public class sorted_array_to_bst {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return bstbuilder(nums, 0, nums.length-1);
    }
    private TreeNode bstbuilder(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bstbuilder(nums, start, mid-1);
        root.right = bstbuilder(nums, mid+1, end);
        return root;
    }
}
