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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList();
        if(root==null)return ans;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int qSize=queue.size();
            List<Integer> list=new ArrayList();
            for(int i=0;i<qSize;i++){
                TreeNode node=queue.poll();
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
                list.add(node.val);
            }
            ans.add(new ArrayList(list));
        }
        return ans;
    }
}