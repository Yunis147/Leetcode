class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 1;
        while(i<=nums.length-1){
            if(nums[i]!=nums[i-1]){
                nums[k]= nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}