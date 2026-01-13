class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<=r)
        {
            if(numbers[l]+numbers[r]>target)r--;
            else if(numbers[l]+numbers[r]<target)l++;
            else return new int[]{l+1,r+1};
        }
        return null;
    }
}

/*My first approach and it's working with O(nlogn) time complexity:-
---->It is best for me because this problem comes under binary search so for this i thought it is best.
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
} */