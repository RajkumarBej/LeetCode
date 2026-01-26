class Solution {
    List<String> solution(int n)
    {
        if(n==1){
            List<String> ans=new ArrayList<>();
            ans.add("0");
            ans.add("1");
            return ans;
        }
        List<String> list=new ArrayList(solution(n-1));
        List<String> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            ans.add("0"+list.get(i));
        }
        for(int j=list.size()-1;j>=0;j--)
        {
            ans.add("1"+list.get(j));
        }
        return ans;
    }
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        List<String> temp=solution(n);
        for(String s:temp){
            ans.add(Integer.parseInt(s,2));
        }
        System.out.println(ans);
        return ans;
    }
}