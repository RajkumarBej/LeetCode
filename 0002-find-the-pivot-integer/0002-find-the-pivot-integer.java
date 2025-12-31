class Solution {
    public int pivotInteger(int n) {
        if(n==1)return n;
        int l=0,r=n,leftSum=l,rightSum=r;
        
        while(l<r)
        {
            if(leftSum<rightSum)
            {
                l++;
                leftSum=leftSum+l;
            }
            else{
                r--;
                rightSum=rightSum+r;
            }
            if(leftSum==rightSum && l+1==r-1)return l+1;
            
        }
        return -1;
    }
}


/*
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
} */