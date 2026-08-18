class Solution {
    void dfs(int img[][], boolean vis[][], int sr, int sc, int color, int t){
        int x[]={0,-1,0,1};
        int y[]={-1,0,1,0};
        img[sr][sc]=color;
        vis[sr][sc]=true;
        for(int i=0;i<4;i++){
            int nx=x[i]+sr;
            int ny=y[i]+sc;
            if(nx>=0 && nx<img.length && ny>=0 && ny<img[0].length && img[nx][ny]==t && !vis[nx][ny]){
                dfs(img, vis, nx, ny, color,t);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        int target=image[sr][sc];
        dfs(image, vis, sr, sc, color, target);
        return image;
    }
}