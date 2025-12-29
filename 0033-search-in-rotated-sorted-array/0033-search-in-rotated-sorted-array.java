//simple leaner search solution
class Solution {
    int linearSearch(int l,int h,int target,int []nums)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<=nums[h])
            {
                if(nums[mid]<=target && target<=nums[h])
                l=mid+1;
                else h=mid-1;
            }
            else{
                if(nums[l]<=target && target<=nums[mid])
                h=mid-1;
                else l=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target)return 0;
        if(nums.length==1 && nums[0]!=target)return -1;
        int l=0,h=nums.length-1;

        return linearSearch(l,h,target,nums);
    }
}