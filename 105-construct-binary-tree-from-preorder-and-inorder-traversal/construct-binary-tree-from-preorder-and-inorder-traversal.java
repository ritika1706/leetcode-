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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return PREINtree(preorder,inorder,0,0,preorder.length-1,inorder.length-1);
    }
public static TreeNode PREINtree(int[]preorder,int[]inorder,int i,int j,int k,int l){
if(i>k || j>l)
{
    return null;
}
TreeNode root= new TreeNode(preorder[i]);
int index=j;
int n=inorder.length-1;
while(inorder[index]!=preorder[i])
{
    index++;
}
int numofElements=index-j;
root.left=PREINtree(preorder,inorder,i+1,j,i+numofElements,index-1);
root.right=PREINtree(preorder,inorder,i+numofElements+1,index+1,k,l);
return root;
}


}