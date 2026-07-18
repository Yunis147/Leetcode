class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}