class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2) return true;
        int temp=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<=arr.length-2;i++)
        {
            int x=Math.abs(arr[i]-arr[i+1]);
            if(x!=temp)return false;
        }
        return true;
    }
}