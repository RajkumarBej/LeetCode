class Solution {
    void combination(int []a,int idx,int t,List<Integer> list,List<List<Integer>> ans){
        if(idx==a.length)
        {
            if(t==0)ans.add(new ArrayList(list));
            return;
        }

        if(a[idx]<=t)//if array index value is greater or equal to target, than we can consider it for sum
        {
            list.add(a[idx]);//insert the value into a temporary list
            combination(a,idx,t-a[idx],list,ans);//find all combination of that index and other remaining indexes untill the target not equal to zero, if target not qual to zero after all posibility back track, means remove list last value and increase ind value.
            list.remove(list.size()-1);
        }
        combination(a,idx+1,t,list,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==1)return Collections.emptyList();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<Integer>();
        combination(candidates,0,target,list,ans);
        return ans;
    }
}