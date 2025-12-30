/*Here if middle elements are same than we can't find first and last index 
to solve this we use two function one is to find first occurance(by traversing left ward)
and  second is to find last occurance(by traversing right ward.).*/
class Solution {
    int leftBinarySearch(int []a,int t)
    {
        int l=0,h=a.length-1,idx=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==t) 
            {h=mid-1;idx=mid;}
            else if(t>a[mid])
            l=mid+1;
            else
            h=mid-1;
        }
        return idx;
    }
    int rightBinarySearch(int []a,int t)
    {
        int l=0,h=a.length-1,idx=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==t) 
            {l=mid+1;idx=mid;}
            else if(t>a[mid])
            l=mid+1;
            else
            h=mid-1;
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};

        int l=leftBinarySearch(nums,target),r=rightBinarySearch(nums,target);
        return new int[]{l,r};
    }
}