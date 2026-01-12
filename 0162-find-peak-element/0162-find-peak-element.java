class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;

        int i=0,j=nums.length-1,mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(mid>0 && mid<nums.length-1 && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])return mid;
            if(nums[mid]<nums[mid+1])i=mid+1;
            else j=mid-1;
        }
        return j;
    }
}