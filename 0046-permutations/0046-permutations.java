class Solution {
    void permutation(int a[],int []dp,int idx,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==a.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(dp[i]==0)
            {
                list.add(a[i]);
                dp[i]=1;
                permutation(a,dp,i,list,ans);
                dp[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        int []dp=new int[nums.length];
        permutation(nums,dp,0,list,ans);
        return ans;
    }
}