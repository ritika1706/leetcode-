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
    public int maxDepth(TreeNode root) {
        
      int ans=  countmax(root);
      return ans;
    }
    public static int countmax(TreeNode root){
        if(root==null){
            return 0 ;
        }
       
        int l=countmax(root.left);
        int r=countmax(root.right);
        return Math.max(l,r)+1;
    }
}