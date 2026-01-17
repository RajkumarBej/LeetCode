class Solution {
    boolean isSafe(int i,int j,int n,String [][]s){
        int deli=i,delj=j;
        while(i>=0 && j>=0)
        {
            if(s[i][j].equals("Q"))return false;
            i--;
            j--;
        }
        j=delj;
        i=deli;
        while(j>=0)
        {
            if(s[i][j].equals("Q"))return false;
            j--;
        }
        j=delj;
        i=deli;
        while(i<n && j>=0)
        {
            if(s[i][j].equals("Q"))return false;
            i++;
            j--;
        }
        return true;
    }
    void keepBord(String [][]s,List<List<String>> ans){
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            String str="";
            for(int j=0;j<s.length;j++)
            {
                str+=s[i][j];
            }
            list.add(str);
        }
        ans.add(new ArrayList(list));
    }
    void queenTest(int j,int n,String [][]s,List<List<String>> ans){
        if(j==n){
            keepBord(s,ans);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(i,j,n,s)){
                s[i][j]="Q";
                queenTest(j+1,n,s,ans);//it means once one row is filled than go for next column all rows.
                s[i][j]=".";
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        String queen[][]=new String[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(String[] rows:queen)Arrays.fill(rows,".");
        queenTest(0,n,queen,ans);
        return ans;
    }
}