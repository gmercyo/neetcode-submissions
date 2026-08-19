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
    private int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            return 1 + Math.max(leftDepth, rightDepth);
        }

    public boolean isBalanced(TreeNode root) {
        // return 0 for null root

        if (root != null) {
             int maxLHeight = maxDepth(root.right);
             int maxRHeight = maxDepth(root.left);
             if (maxLHeight - maxRHeight > 1 || maxRHeight - maxLHeight > 1) return false;
             return isBalanced(root.left) && isBalanced(root.right);
        }
        return true;
    }
}
