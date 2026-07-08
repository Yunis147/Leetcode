class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=0;
        if(target>nums[high]){
            return nums.length;
        }
        if(target<nums[low]){
            return 0;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}