class Solution {
    boolean check(int n)
    {
        int temp=n;
        while(n>0)
        {
            int x=n%10;
            if(x==0)return false;
            if(temp%x!=0)return false;
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))list.add(i);
        }
        return list;
    }
}