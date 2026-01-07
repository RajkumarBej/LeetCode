class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        boolean flag=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<1)continue;
            if(i<nums.length-1 && nums[i]==nums[i+1])continue;
            if(flag && nums[i]>1){
                flag=false;
                return 1;
            }
            else flag=false;
            if(i<nums.length-1 && nums[i]+1!=nums[i+1])return nums[i]+1;
        }
        if(nums[nums.length-1]<1)return 1;
        return nums[nums.length-1]+1;
    }
}