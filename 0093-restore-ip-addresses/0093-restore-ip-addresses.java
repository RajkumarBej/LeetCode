class Solution {
    boolean isSafe(String s){
        if(s.length()>1 && s.charAt(0)=='0')return false;
        int temp=Integer.parseInt(s);
        return temp>=0 && temp<=255;
    }
    void solve(int i,int parts,String ns,String s,List<String> ans){
        if(parts==0 && i==s.length()){
            ans.add(ns.substring(0,ns.length()-1));
            return;
        }
        if(parts==0)return;

            if(i+1<=s.length())solve(i+1,parts-1,ns+s.substring(i,i+1)+".",s,ans);//cmpareing index of 1 length
            if(i+2<=s.length() && isSafe(s.substring(i,i+2)))solve(i+2,parts-1,ns+s.substring(i,i+2)+".",s,ans);//compareing index of 2 length
            if(i+3<=s.length() && isSafe(s.substring(i,i+3)))solve(i+3,parts-1,ns+s.substring(i,i+3)+".",s,ans);//comparing index of 3 length
            //if any of index is valid than increase index to its coressponding value by concatination a "."
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> ans =new ArrayList<String>();
        if(s.length()>12)return ans;
        solve(0,4,"",s,ans);
        System.out.println(ans);
        return ans;
    }
}