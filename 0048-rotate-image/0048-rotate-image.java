class Solution {
    void swap(int i,int j,int [][]a){
        int temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    void reverse(int i,int [][]a){
        int l=0,r=a.length-1;
        while(l<=r)
        {
            int temp=a[i][l];
            a[i][l]=a[i][r];
            a[i][r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++)
            {
                swap(i,j,matrix);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(i,matrix);
        }
    }
}