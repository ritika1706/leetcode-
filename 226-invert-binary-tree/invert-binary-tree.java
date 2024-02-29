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
    public TreeNode invertTree(TreeNode root) {
       return swapnodes(root);
    }

    public static TreeNode swapnodes(TreeNode root){
        if(root==null){
            return null;
        }
swapnodes( root.left);
TreeNode temp=root.left;
swapnodes( root.right);
root.left=root.right;
root.right=temp;
return root;

    }
}