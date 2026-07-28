class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        int secMin = nums[1];
        int max = nums[n-1];
        int secMax = nums[n-2];
        int thirdMax = nums[n-3];
        int maxProd = Math.max(min*secMin*max,max*secMax*thirdMax);
        return maxProd;
    }
}