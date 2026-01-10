class Solution {
    public int mySqrt(int x) {
        long i=1,j=x/2+1,mid=1;
        while(i<=j){
            mid=(i+j)/2;
            if((mid*mid)<=x)i=mid+1;
            else {
                j=mid-1;
            }
        }
        return (int)j;
    }
}