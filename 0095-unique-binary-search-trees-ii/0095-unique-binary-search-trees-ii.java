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
    List<TreeNode> unique(int l,int r){
        List<TreeNode> ans=new ArrayList<TreeNode>();
        if(l>=r){
            if(l==r){
                TreeNode node=new TreeNode(l);
                ans.add(node);
            }
            else ans.add(null);
            return ans;
        }
        for(int i=l;i<=r;i++)
        {
            List<TreeNode> lList=unique(l,i-1);//generating all left sub tree list
            List<TreeNode> rList=unique(i+1,r);//generation all ringht sub tree list
            for(TreeNode ltree:lList){
                for(TreeNode rtree:rList){
                    TreeNode node=new TreeNode(i);
                    node.left=ltree;
                    node.right=rtree;
                    ans.add(node);
                }
            }
        }
        return ans;
    }
    public List<TreeNode> generateTrees(int n) {
        return unique(1,n);
    }
}

/*
unique(1,3):
   i=1 → root=1
       left = unique(1,0) → [null]
       right = unique(2,3) → [trees with 2..3]
       combine → Tree with root=1

   i=2 → root=2
       left = unique(1,1) → [1]
       right = unique(3,3) → [3]
       combine → Tree with root=2

   i=3 → root=3
       left = unique(1,2) → [trees with 1..2]
       right = unique(4,3) → [null]
       combine → Tree with root=3 */