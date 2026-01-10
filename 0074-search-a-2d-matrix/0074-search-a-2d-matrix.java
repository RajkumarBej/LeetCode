class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,m=matrix.length,n=matrix[0].length,j=(m*n)-1,mid=0;
        //in order to represent 2d matrix into 1d we traverse from i=0 to 11. we can get row no i/n(becaue each row is multiple of 4 here, if our element is in second row so one row is completed so division return 1 similarly we can generate 0,1,2(in simple words it means how much completed)) and column no by i%n(beacause each row has 4 element here, we need 0,1,2,3 indexes(in simple word it means how much remaining)).
        while(i<=j)
        {
            mid=(i+j)/2;
            if(matrix[mid/n][mid%n]==target)return true;
            if(matrix[mid/n][mid%n]<target)i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}