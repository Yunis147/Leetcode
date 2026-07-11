class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerbound(nums,target);
        int hb = higherbound(nums,target)-1;
        if(lb==nums.length||nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,hb};
    }
    public int lowerbound(int [] nums,int target){
        int low =0;
        int high = nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int higherbound(int [] nums,int target){
        int low =0;
        int high = nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}