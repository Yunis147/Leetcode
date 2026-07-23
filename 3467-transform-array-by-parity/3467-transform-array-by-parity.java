class Solution {
    public int[] transformArray(int[] nums) {
        int odd=0;
        for(int num:nums){
            if(num%2!=0) odd++;
        }
        int last = nums.length-1;
        while(odd>0){
            nums[last]=1;
            last--;
            odd--;
        }
        while(last>=0){
            nums[last--]=0;
        }
        return nums;
    }
}