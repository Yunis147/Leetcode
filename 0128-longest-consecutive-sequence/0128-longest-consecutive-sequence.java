class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int max=0;
        int count=0;
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        for(Integer i:s){
            if(!s.contains(i-1)){
                int cur=i;
                count=1;
                while(s.contains(cur+1)){
                    count++;
                    cur++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}