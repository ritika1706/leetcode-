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

     return  findSum(root,"");

        
        
    }
     public int findSum(TreeNode root,String currSum  ){
         if(root==null){
             return 0;
         }
         currSum+=root.val;
        if(root.left==null && root.right==null)
{
    
    return  Integer.parseInt(currSum);
}       int leftsum  = findSum(root.left,currSum);
        int rightsum=  findSum(root.right,currSum);
          return leftsum+rightsum;

     }

}