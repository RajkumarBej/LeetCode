class Solution {
    void solve(int k,int []a,List<Integer> list,Set<List<Integer>> set){
        set.add(new ArrayList<>(list));
        for(int i=k;i<a.length;i++)
        {
            list.add(a[i]);
            solve(i+1,a,list,set);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        solve(0,nums,list,set);
        List<List<Integer>> ans=new ArrayList<>(set);
        //System.out.println(set);
        //System.out.println(ans);
        return ans;
    }
}