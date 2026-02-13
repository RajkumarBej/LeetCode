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
    TreeNode v1=null,v2=null,prev=null;
    void nodeSwap(TreeNode node1,TreeNode node2){
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
    }
    void findFaultNode(TreeNode root){
        if(root==null)return;
        findFaultNode(root.left);
        if(prev!=null && prev.val>root.val){
            if(v1==null){
            v1=prev;
            v2=root;
            }else v2=root;
        }
        prev=root;
        findFaultNode(root.right);
    }
    public void recoverTree(TreeNode root) {
        findFaultNode(root);
        nodeSwap(v1,v2);
    }
}