class Solution {
    int patternMatch(int i,int j,String s, String p,int dp[][]){
        if(i<0 && j<0)return 1;
        if(i>=0 && j<0)return -1;
        if(i<0 && j>=0){
            for(int ii=0;ii<=j;ii++)
            if(p.charAt(ii)!='*') return -1;
            return 1;
        }
        if(dp[i][j]!=0)return dp[i][j];
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j]=patternMatch(i-1,j-1,s,p,dp);
        }
        else if(p.charAt(j)=='*'){
            int temp1=patternMatch(i-1,j,s,p,dp);
            int temp2=patternMatch(i,j-1,s,p,dp);
            if(temp1==1 && temp2==1)temp1=1;
            else if(temp1==1 && temp2==-1)temp1=1;
            else if(temp1==-1 && temp2==1)temp1=1;
            else if(temp1==-1 && temp2==-1)temp1=-1;
            dp[i][j]=temp1;
            return temp1;
        }
        else return -1;
    }
    public boolean isMatch(String s, String p) {
        int dp[][]=new int[s.length()][p.length()];
        if(patternMatch(s.length()-1,p.length()-1,s,p,dp)==1)return true;
        else return false;
    }
}

/*My first approach:- it is correct but taking exponential time so i have to store the result in a array to apply dynamic programming
class Solution {
    boolean patternMatch(int i,int j,String s, String p){
        if(i<0 && j<0)return true;
        if(i>=0 && j<0)return false;
        if(i<0 && j>=0){// if string is end and still there are some patter than these must be '*'. If any one is not '*' return false.
            for(int ii=0;ii<=j;ii++)
            if(p.charAt(ii)!='*') return false;
            return true;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') return patternMatch(i-1,j-1,s,p);//if characters mathes with each other or matches with '?' than shift the i and j value.
        else if(p.charAt(j)=='*') return (patternMatch(i-1,j,s,p) || patternMatch(i,j-1,s,p));//if there is * occer in the pattern than it may equal with ' ' or with any sequence to check it apply both cases, once by keeping '*' check for pattern and than remove '*' and check.
        else return false;
    }
    public boolean isMatch(String s, String p) {
        return patternMatch(s.length()-1,p.length()-1,s,p);
    }
} */