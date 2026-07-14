class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] arr = new int[nums.length];
        int a=nums.length-1;
        while(i<=j){
            int m=nums[i]*nums[i];
            int n=nums[j]*nums[j];
            if(m>n){
                arr[a]=m;
                i++;
            }else{
                arr[a]=n;
                j--;
            }
            a--;
        }
        return arr;
    }
}