class Solution {
    public int[] transformArray(int[] nums) {
        int[] n = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i] = nums[i]%2==0?0:1;
        }
        Arrays.sort(n);
        return n;
    }
}