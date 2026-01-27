class Solution {
    void solution(int k,int[] n,List<Integer> list,Set<List<Integer>> set){
        List<Integer> temp=new ArrayList<>(list);
        Collections.sort(temp);
        set.add(new ArrayList<>(temp));
        temp=new ArrayList<>();
        for(int i=k;i<n.length;i++)
        {
            list.add(n[i]);
            solution(i+1,n,list,set);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        solution(0,nums,list,set);
        List<List<Integer>> ans=new ArrayList<>(set);
        System.out.println(ans);
        return ans;
    }
}