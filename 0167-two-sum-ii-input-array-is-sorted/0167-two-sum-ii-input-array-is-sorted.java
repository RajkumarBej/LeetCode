class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=0,mid=0,t=target,ans[]=new int[2];
        for(int i=0;i<=numbers.length-1;i++)
        {
            ans[0]=i+1;
            t=t-numbers[i];
            l=i+1;
            r=numbers.length-1;
            while(l<=r)
            {
                mid=(l+r)/2;
                if(numbers[mid]==t){
                    ans[1]=mid+1;
                    return ans;
                }
                if(numbers[mid]<t)l=mid+1;
                else r=mid-1;
            }
            t=target;
        }
        System.out.println("fiojif");
        return ans;
    }
}