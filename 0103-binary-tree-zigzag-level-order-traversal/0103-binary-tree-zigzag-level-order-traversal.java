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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return Arrays.asList();
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=true;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int qLen=q.size();
            for(int i=0;i<qLen;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                list.add(q.poll().val);
            }
            if(flag)ans.add(new ArrayList<>(list));
            else{
                Collections.reverse(list);
                ans.add(new ArrayList<>(list));
            }
            flag=!flag;
        }
        return ans;
    }
}