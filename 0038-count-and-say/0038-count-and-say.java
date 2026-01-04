class Solution {
    String count(int n){
        if(n==1)return"1";
        String temp=count(n-1),str="";
        char ch;
        int i=0;
        while(i<temp.length() && i<temp.length())
        {
            int count=1;
            ch=temp.charAt(i);
            while(i<temp.length()-1 && temp.charAt(i)==temp.charAt(i+1))
            {
                count++;
                i++;
            }
            str=str+Integer.toString(count)+Character.toString(ch);
            i=i+1;
            //System.out.println(str);
        }
        return str;
    }
        
    public String countAndSay(int n) {
        return count(n);
    }
}