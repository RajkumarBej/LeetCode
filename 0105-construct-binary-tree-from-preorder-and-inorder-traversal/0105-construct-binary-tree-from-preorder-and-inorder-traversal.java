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
    public TreeNode arrangeValues(int[] preorder, int preS, int preE, int[] inorder, int inS,int inE, Map<Integer, Integer> inMap){
        if(preS>preE || inS>inE)return null;

        TreeNode root=new TreeNode(preorder[preS]);

        int inIndx=inMap.get(root.val);
        int numLeft=inIndx-inS;

        root.left=arrangeValues(preorder,preS+1,preS+numLeft,inorder,inS,inIndx-1,inMap);
        root.right=arrangeValues(preorder,preS+numLeft+1,preE,inorder,inIndx+1,inE,inMap);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)inMap.put(inorder[i],i);

        TreeNode root=arrangeValues(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);

        return root;
    }
}