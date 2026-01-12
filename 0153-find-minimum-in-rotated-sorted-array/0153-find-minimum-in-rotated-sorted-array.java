class Solution {
    public int findMin(int[] nums) {
        int j=nums.length-1;
        for(int k=j;k>0;k--)
        if(nums[k]<nums[k-1])return nums[k];

        return nums[0];
    }
}