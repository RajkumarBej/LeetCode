class Solution {
    boolean solve(int k,int i,int j,String s,int [][]vis,char[][] a)
    {
        if(k==s.length())return true;
        int deli[]={-1,0,1,0},delj[]={0,1,0,-1};
        for(int l=0;l<4;l++)
        {
            int ni=i+deli[l],nj=j+delj[l];
            if(ni<a.length && ni>=0 && nj>=0 && nj<a[0].length && vis[ni][nj]==0){
                if(a[ni][nj]==s.charAt(k)){
                    vis[ni][nj]=1;
                    k=k+1;
                    if(solve(k,ni,nj,s,vis,a))return true;
                    k=k-1;
                    vis[ni][nj]=0;
                }
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        //System.out.println(n+" "+m);
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j]){
                    vis[i][j]=1;
                    if(solve(1,i,j,word,vis,board))return true;
                    vis[i][j]=0;
                }
            }
        }
        
        return false;
    }
}