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
    public int sumNumbers(TreeNode root) {
        if(root.left == null && root.right != null) {
            return sumNumbers(new TreeNode((root.val * 10 + root.right.val), root.right.left, root.right.right));
        } else if(root.right == null && root.left != null) {
            return sumNumbers(new TreeNode((root.val * 10 + root.left.val), root.left.left, root.left.right));
        } else if(root.right == null && root.left == null) {
            return root.val;
        }
        
        int left = sumNumbers(new TreeNode((root.val * 10 + root.left.val), root.left.left, root.left.right));
        int right = sumNumbers(new TreeNode((root.val * 10 + root.right.val), root.right.left, root.right.right));
        
        
        
        return left + right;
    }
}