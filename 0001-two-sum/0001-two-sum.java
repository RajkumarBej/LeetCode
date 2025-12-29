class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arraySize=nums.length;
        for(int i=0;i<arraySize;i++)
        {
            for(int j=i+1;j<arraySize;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    int ans[]={i,j};
                    return ans;
                }
            }
        }
        return new int[]{};
    }
}