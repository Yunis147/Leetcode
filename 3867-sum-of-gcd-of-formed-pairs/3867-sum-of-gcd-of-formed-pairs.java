class Solution {
    public long gcdSum(int[] nums) {
        int prefix[] = new int[nums.length];
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            prefix[i] = gcd(nums[i],mx);
        }
        Arrays.sort(prefix);
        int l=0;
        int r=prefix.length-1;
        long sum=0;
        while(l<r){
            sum+=gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}