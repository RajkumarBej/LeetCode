class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)return -1;
        int x=1,count=1;
        while(x<=Integer.MAX_VALUE)
        {
            if(x%k==0){
                return count;
            }
            else {
                x=x%k;//formulla
                x=x*10+1;
                count++;
            }
        }
        return -1;
    }
}