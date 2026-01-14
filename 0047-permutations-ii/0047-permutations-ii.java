class Solution {
    void permutation(int []a,int dp[],List<Integer> list,Set<List<Integer>> set)
    {
        if(list.size()==a.length)
        {
            set.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(dp[i]==0)
            {
                dp[i]=1;
                list.add(a[i]);
                permutation(a,dp,list,set);
                dp[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int []dp=new int[nums.length];
        permutation(nums,dp,list,set);

        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}