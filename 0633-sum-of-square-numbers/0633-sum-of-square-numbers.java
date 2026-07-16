class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(int)Math.sqrt(c);
        while(a<=b){
            long sq = a*a+b*b;
            if(sq==c){
                return true;
            }else if(sq>c){
                b--;
            }else{
                a++;
            }
        }
        return false;
    }
}