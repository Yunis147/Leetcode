class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=n-1;
        int j=0;
        while(j<=i){
            if(nums[j]==val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i--;
            }else{
                j++;
            }
        }
        return j;
    }
}