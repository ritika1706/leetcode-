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
 *         this.right = r0...
 
 
 ight;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
  




    return inpotree(inorder,postorder,0,0,inorder.length-1,postorder.length-1); 
    }
    public TreeNode  inpotree(int[] inorder, int[] postorder, int i,int j,int k,int l){
if (i > k || j > l) {
            return null;
        }

   TreeNode root = new TreeNode(postorder[l]);
int index=i;
while(inorder[index]!=postorder[l]){
index++;
}
int Q=index-i;
  root.left=inpotree(inorder,postorder,i,j,i+Q-1,j+Q-1);
  root.right=  inpotree(inorder,postorder,index+1,j+Q,k,l-1);                                                       
return root;

    }
}