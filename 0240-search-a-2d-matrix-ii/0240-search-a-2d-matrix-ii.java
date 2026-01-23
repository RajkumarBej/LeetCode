class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]<target)row++;
            else col--;
        }
        return false;
    }
}

/*My first approach:-
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            int l=0,r=n-1,mid=0;
            while(l<=r){
                mid=(l+r)/2;
                if(matrix[i][mid]==target)return true;
                if(matrix[i][mid]>target)r=mid-1;
                else l=mid+1;
            }
        }
        return false;
    }
} */