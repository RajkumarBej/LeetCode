class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==1 && nums[0]>=target)return 1;
        if(nums.length==1 && nums[0]<target)return 0;
        int i=0,j=0,window=Integer.MAX_VALUE,sum=0;
        while(j<nums.length){
            if(nums[i]>=target || nums[j]>=target)return 1;
            sum+=nums[j];
            j+=1;
            if(i==0 && j==nums.length && sum<target)return 0;
            //System.out.println(i+"\t"+j+"\t"+sum);
            while(i<nums.length && sum>=target){
                sum-=nums[i];
                i+=1;
                window=Math.min(window,j-i+1);
            }
            //System.out.println(i+"\t"+j+"\t"+sum);
            //System.out.println(window);
        }
        return window;
    }
}

/*My won approach:-
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==1 && nums[0]>=target)return 1;
        if(nums.length==1 && nums[0]<target)return 0;
        int i=0,j=i+1,window=Integer.MAX_VALUE,sum=nums[0];
        while(i<j && i<nums.length && j<nums.length){
            if(nums[i]>=target || nums[j]>=target)return 1;
            while(j<nums.length && sum<target){
                sum+=nums[j];
                j+=1;
            }
            if(i==0 && j==nums.length && sum<target)return 0;
            //System.out.println(i+"\t"+j+"\t"+sum);
            while(i<nums.length && sum>=target){
                sum-=nums[i];
                i+=1;
            }
            window=Math.min(window,j-i+1);
            //System.out.println(i+"\t"+j+"\t"+sum);
            //System.out.println(window);
        }
        return window;
    }
} */