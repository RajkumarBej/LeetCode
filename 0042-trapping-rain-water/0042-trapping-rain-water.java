class Solution {
    public int trap(int[] height) {
        int max=0,leftMax[]=new int[height.length],rightMax[]=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>=max)
            {
                leftMax[i]=height[i];
                max=height[i];
            }
            else leftMax[i]=max;
        }

        max=0;
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>=max)
            {
                rightMax[i]=height[i];
                max=height[i];
            }
            else rightMax[i]=max;
        }
        int total=0;
        for(int i=0;i<height.length;i++)
        {
            total=total+(Math.min(leftMax[i],rightMax[i])-height[i]);
        }

        return total;
    }
}