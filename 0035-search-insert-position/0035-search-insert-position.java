class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>=target)return 0;
        if(nums[nums.length-1]<target)return nums.length;
        if(nums[nums.length-1]==target)return nums.length-1;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>=target)r=mid-1;
            if(nums[mid]<=target)l=mid+1;
            if(mid+1<=nums.length-1 && nums[mid]<target && target<nums[mid+1])return mid+1;
            if(mid-1>=0 && nums[mid-1]<target && target<nums[mid])return mid;
        }
        return 0;
    }
}