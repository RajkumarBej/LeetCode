class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2) return true;
        //System.out.println(arr.length);
        int temp=Math.abs(arr[0]-arr[1]);
        //System.out.println(temp);
        
        for(int i=1;i<=(arr.length-2);i++)
        {
            if(Math.abs(arr[i]-arr[i+1])!=temp)return false;
        }
        return true;
    }
}