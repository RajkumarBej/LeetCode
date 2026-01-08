class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,leftMax=0,rightMax=0,total=0;
        while(i<j)
        {
            leftMax=Math.max(leftMax,height[i]);
            rightMax=Math.max(rightMax,height[j]);

            if(leftMax<rightMax)
            {
                total+=leftMax-height[i];
                i++;
            }
            else
            {
                total+=rightMax-height[j];
                j--;
            }
        }
        return total;
    }
}

/*First approach:-
class Solution {
    public int trap(int[] height) {
        int max=0,leftMax[]=new int[height.length],rightMax[]=new int[height.length];
        for(int i=0;i<height.length;i++)//find left max prefix
        {
            if(height[i]>=max)
            {
                leftMax[i]=height[i];
                max=height[i];
            }
            else leftMax[i]=max;
        }

        max=0;
        for(int i=height.length-1;i>=0;i--)//find right max prefix
        {
            if(height[i]>=max)
            {
                rightMax[i]=height[i];
                max=height[i];
            }
            else rightMax[i]=max;
        }
        int total=0;
        for(int i=0;i<height.length;i++)//than minimum between tham making contener and if we subtract it from our current height we can get how much water is stored in the current building and repeat this for every building.
        {
            total=total+(Math.min(leftMax[i],rightMax[i])-height[i]);
        }

        return total;
    }
} */