class Solution {
    boolean isPalendromic(String s){
        if(s.length()==1)return true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    void palendromic(String s,int k,List<String> list,List<List<String>> ans){
        if(k==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=k;i<s.length();++i){
            if(isPalendromic(s.substring(k,i+1))){
                list.add(s.substring(k,i+1));
                palendromic(s,i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        palendromic(s,0,list,ans);
        return ans;
    }
}