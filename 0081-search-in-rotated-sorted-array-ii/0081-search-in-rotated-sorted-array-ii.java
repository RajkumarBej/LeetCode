class Solution {
    public boolean search(int[] nums, int target) {
        int div=0,i=0,j=nums.length-1,mid=0;
        for(int k=nums.length-1;k>0;k--)
        {
            if(nums[k]>=nums[k-1])continue;
            else{
                div=k;
                break;
            }
        }
        //System.out.println(nums[div]+"\t"+div);
        if(nums[div]==target)return true;
        else if(nums[j]<=target)
        {
            if(nums[j]==target)return true;
            else j=div-1;
        }
        else i=div+1;
        
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]==target)return true;
            if(nums[mid]<target)i=mid+1;
            else j=mid-1;
        }
        //System.out.println(nums[div]+"\t"+div);
        return false;
    }
}