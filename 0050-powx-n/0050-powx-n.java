class Solution {
    public double powCalculation(double x, int n, double pow){
        if(n==0)return pow;

        //if the power is odd than reduce by one to do even
        if(n%2==1){
            //you are reducing power or n by one so, you have to multiply x one time with pow.
            pow=pow*x;
            n=n-1;
        }

        //find x square and store it in x in every iterration
        x=x*x;
        //you did base square so you have to reduce the power by dividing 2.
        n=n/2;
        //now again call the function to repeate the entire porcess till powe is 0.
        return powCalculation(x,n,pow);
    }
    public double myPow(double x, int n) {
        //System.out.println(powCalculation(x,n,1));
        if(x<0 && n==Integer.MIN_VALUE)return 1.0/powCalculation(x*-1,Integer.MAX_VALUE,1);
        if(n==Integer.MIN_VALUE)return 1.0/powCalculation(x,Integer.MAX_VALUE,1);
        if(n<0) return 1.0/powCalculation(x,n*-1,1);
        
        return powCalculation(x,n,1);
    }
}