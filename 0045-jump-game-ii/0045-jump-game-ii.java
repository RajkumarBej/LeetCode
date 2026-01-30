class Solution {
    int solution(int i,int[] a,int jumpCount){
        int minv=Integer.MAX_VALUE;
        if(i>=a.length-1){
            return jumpCount;
        }
        for(int j=1;j<=a[i];j++){
            minv=Math.min(minv,solution(i+j,a,jumpCount+1));
        }
        return minv;
    }
    public int jump(int[] nums) {
        return solution(0,nums,0);
    }
}