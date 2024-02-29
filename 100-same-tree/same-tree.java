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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return  checksame(p,q);

    }
  public boolean checksame(TreeNode p, TreeNode q) {
    // Base case: both nodes are null, they are considered the same
    if (p == null && q == null) {
        return true;
    }

    // If one of the nodes is null and the other is not, they are not the same
    if (p == null || q == null) {
        return false;
    }

    // Check if the values are equal
    if (p.val != q.val) {
        return false;
    }

    // Recursively check the left and right subtrees
    boolean leftSame = checksame(p.left, q.left);
    boolean rightSame = checksame(p.right, q.right);

    // Return true only if both left and right subtrees are the same
    return leftSame && rightSame;
}
}