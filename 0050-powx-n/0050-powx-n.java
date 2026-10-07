class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N = -N;
            return 1/helper(x,N);
        }
        return helper(x,N);
    }
    public double helper(double x , long n){
        if(n==0) return 1;
        if(x==0) return 0;
        double res = helper(x,n/2);
        res = res*res;
        return n%2==0?res:x*res;
    }
}