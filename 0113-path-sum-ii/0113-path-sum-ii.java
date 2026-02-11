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
    public void validSum(TreeNode root,int t,int sum,List<Integer> list,List<List<Integer>> ans){
        if(root==null)return;
        int value=root.val;
        list.add(value);
        if(root.left==null && root.right==null && sum+value==t){
            ans.add(new ArrayList<>(list));
        }
        validSum(root.left,t,sum+value,list,ans);
        //list.remove(list.size()-1);
        validSum(root.right,t,sum+value,list,ans);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        validSum(root,targetSum,0,list,ans);
        return ans;
    }
}