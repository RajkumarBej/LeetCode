class Solution {
    public String multiply(String num1, String num2) {
        char s1[]=reverse(num1),s2[]=reverse(num2);
        int s3[]=new int[num1.length()+num2.length()];
        String ans="";
        for(int i=0;i<s1.length;i++)
        {
            int carry=0,start=i;
            for(int j=0;j<s2.length;j++)
            {
                int n1=s1[i]-'0',n2=s2[j]-'0';
                s3[start]=(n1*n2)+s3[start]+carry;
                carry=s3[start]/10;
                s3[start]=s3[start]%10;
                start++;
            }
            if(carry!=0) s3[start]=carry;
        }
        int i=s3.length-1;
        while(i>0 && s3[i]==0)i--;

        while(i>=0)
        ans+=s3[i--];

        return ans;
    }
    char[] reverse(String num){
        char []ch=num.toCharArray();
        int start=0,end=num.length()-1;
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return ch;
    }
}

/*first approach:-
class Solution {
    public String multiply(String num1, String num2) {
        int first=0,second=0;
        for(int i=0;i<num1.length();i++)
            first=(first*10)+(num1.charAt(i)-'0');

        for(int i=0;i<num2.length();i++)
            second=(second*10)+(num2.charAt(i)-'0');

        System.out.println(first+"\t"+second);

        return Integer.toString(first*second);
    }
} */