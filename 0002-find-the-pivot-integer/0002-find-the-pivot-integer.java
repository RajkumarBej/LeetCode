class Solution {
    public int pivotInteger(int n) {
        if(n==1)return 1;
        int leftSum=0,rightSum=0;
        for(int i=n/2;i<=n;i++)
        {
            for(int j=i;j>=1;j--)leftSum=leftSum+j;
            for(int j=i;j<=n;j++)rightSum=rightSum+j;
            //System.out.println(i+"\t"+leftSum+"\t"+rightSum);
            if(leftSum==rightSum)return i;
            leftSum=0;
            rightSum=0;
        }
        return -1;
    }
}