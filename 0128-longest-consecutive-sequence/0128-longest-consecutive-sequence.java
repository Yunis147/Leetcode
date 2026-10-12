class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        int count =0;
        HashSet<Integer> s = new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        for(Integer i:s){
            if(!s.contains(i-1)){
                int cur = i;
                count = 1;
                while(s.contains(cur+1)){
                    count++;
                    cur = cur+1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}