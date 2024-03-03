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
    public int countNodes(TreeNode root) {
       return  NumOfNodes(root);
}
    public static int  NumOfNodes(TreeNode root){
      if(root==null){
          return 0;
      }
      int leftcount= NumOfNodes(root.left);
        int rightcount= NumOfNodes(root.right);
return leftcount+rightcount+1;

    }

}