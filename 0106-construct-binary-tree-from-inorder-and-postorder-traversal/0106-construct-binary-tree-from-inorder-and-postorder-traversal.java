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
    public TreeNode creation(int []postorder,int ps,int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map){
        if(ps>pe || is>ie)return null;

        TreeNode node=new TreeNode(postorder[pe]);

        int inorderIdx=map.get(node.val);
        int leftCount=inorderIdx-is;

        node.left=creation(postorder,ps,ps+leftCount-1, inorder,is,inorderIdx-1,map);
        node.right=creation(postorder,ps+leftCount,pe-1,inorder,inorderIdx+1,ie,map);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map=new HashMap();
        for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);

        TreeNode root=creation(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
        return root;
    }
}