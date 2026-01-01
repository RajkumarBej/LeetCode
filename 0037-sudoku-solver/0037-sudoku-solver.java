class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean validity(int i,int j,char k,char [][]g)
    {
        for(int x=0;x<9;x++)
        {
            if(g[i][x]==k)
            return false;
            if(g[x][j]==k)
            return false;
            if(g[3*(i/3)+x/3][3*(j/3)+x%3]==k)//formulla:-g[3*(i/3)+x/3][3*(j/3)+x%3]
            return false;
        }
        return true;
    }
    
    boolean solve(char [][]board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(validity(i,j,k,board)==true)
                        {
                            board[i][j]=k;
                            if(solve(board)==true)
                            return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}