class Solution {
    public int singleNonDuplicate(int[] nums) {
     int l=0;
     int r=nums.length-1;
     while(l<=r){
        int mid=(l+r)/2;
         if(l==r){
            return nums[l];
         }
        if(nums[mid]==nums[mid-1]){
            if((r-mid)%2==0){
                r=mid-2;
            }else{
                l=mid+1;
            }
        }else if(nums[mid]==nums[mid+1]){
            if((r-mid)%2==0){
                l=mid+2;
            }else{
                r=mid-1;
            }
        }else{
            return nums[mid];
        }
     }
     return -1;
    }
}