class Solution {
    public void dfs(char[][] grid, boolean vis[][], int i, int j){
        int x[] = {0,-1,0,1};
        int y[] = {-1,0,1,0};
        vis[i][j]=true;
        for(int p=0;p<4;p++){
            int row = i+x[p];
            int col = j+y[p];
            if(row<grid.length && row>=0 && col<grid[0].length && col>=0 && grid[row][col]=='1' && !vis[row][col]){
                dfs(grid, vis, row, col);
            }
        }
    }
    public int numIslands(char[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];

        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}