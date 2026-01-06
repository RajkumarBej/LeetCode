class Solution {
    void combination(int []a,int idx,int t,List<Integer> list,List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList(list));
            return ;
        }
        for(int i=idx;i<a.length;i++)
        {
            if(i>idx && a[i]==a[i-1])continue;
            if(a[i]>t)break;

            list.add(a[i]);
            combination(a,i+1,t-a[i],list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,0,target,new ArrayList<Integer>(),ans);
        return ans;
    }
}