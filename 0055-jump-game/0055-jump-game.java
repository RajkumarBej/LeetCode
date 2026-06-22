class Solution {
    public boolean canJump(int[] nums) {
        int goal=0;
        for(int i=0;i<nums.length;i++){
            if(i>goal)return false;
            goal=Math.max(goal,i+nums[i]);
        }
        return true;
    }
}

/* My First Approach:-
class Solution {
    public boolean jump(int idx, int []a,boolean dp[]){
        if(idx==a.length-1){
            dp[idx]=true;
            return true;
        }
        if(idx>=a.length)
        return false;

        for(int i=1;i<=a[idx];i++){
            if(dp[idx+i])return true;
            if(jump(idx+i,a,dp))
            return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        boolean a[]=new boolean[nums.length];
        if(jump(0,nums,a))return true;
        return false;
    }
} */