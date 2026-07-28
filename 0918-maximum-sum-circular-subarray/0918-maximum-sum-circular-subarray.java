class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum=0;
        int total=0;
        for(int n:nums){
            sum+=n;
            total+=n;
            maxSum=Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        if(maxSum<0) return maxSum;
        sum=0;
        for(int n:nums){
            sum+=n;
            minSum=Math.min(sum,minSum);
            if(sum>0){
                sum=0;
            }
        }
        return Math.max(maxSum,total-minSum);
    }
}