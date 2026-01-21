class Solution {
    int count=0;
    public boolean isValid(int i,int j,char[][] c){
        int deli=i,delj=j;
        while(i>=0 && j>=0)
        {
            if(c[i][j]=='Q')return false;
            i--;j--;
        }
        i=deli;
        j=delj;
        while(j>=0){
            if(c[i][j]=='Q')return false;
            j--;
        }
        i=deli;
        j=delj;
        while(i<c.length && j>=0){
            if(c[i][j]=='Q')return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(int j,int n,char[][] c){
        if(j==n){
            count++;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isValid(i,j,c)){
                c[i][j]='Q';
                solve(j+1,n,c);
                c[i][j]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        char ch[][]=new char[n][n];
        for(char row[]:ch)
        Arrays.fill(row,'.');
        solve(0,n,ch);
        return count;
    }
}