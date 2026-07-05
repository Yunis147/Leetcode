class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        if(x<0){
            return false;
        }
        int ori=x;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(rev==ori){
            return true;
        }
        return false;
    }
}