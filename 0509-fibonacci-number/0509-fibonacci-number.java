class Solution {
    public int fib(int n) {
        return check(n);
    }
    public int check(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return check(n-1)+check(n-2);
        }
    }
}