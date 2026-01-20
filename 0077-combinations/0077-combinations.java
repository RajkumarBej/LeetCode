class Solution {
    void combination(int n,int k,List<Integer> list,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(n==0)return;
        list.add(n);
        //pick the nth element
        combination(n-1,k-1,list,ans);
        list.remove(list.size()-1);
        //not pick the nth element
        combination(n-1,k,list,ans);
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        combination(n,k,list,ans);
        return ans;
    }
}
/*My first approach:- it work fine but after problem 23 it taking lot of time 
class Solution {
    void combination(int n,int k,List<Integer> list,Set<List<Integer>> set){
        if(list.size()==k)
        {
            List<Integer> templist=new ArrayList<>(list);
            Collections.sort(templist);
            set.add(new ArrayList<>(templist));
            templist.clear();
            return;
        }
        for(int i=1;i<=n;i++)
        {
            if(!list.contains(i)){
                list.add(i);
                combination(n,k,list,set);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        if(n==k){
            for(int i=1;i<=n;i++)list.add(i);
            List<List<Integer>> temp=new ArrayList<>();
            temp.add(new ArrayList<>(list));
            return temp;
        }
        combination(n,k,list,set);
        List<List<Integer>> ans =new ArrayList<>(set);
        System.out.println(set);
        System.out.println(ans);
        return ans;
    }
}*/