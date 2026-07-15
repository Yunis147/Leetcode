class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            int l=i+1;
            int r=nums.size()-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(nums.get(i)+nums.get(mid)>=target){
                    r=mid-1;
                }else{
                    count++;
                    l++;
                }
            }
        }
        return count;
    }
}