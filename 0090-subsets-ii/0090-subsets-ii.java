class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,l,subset);
        return l;
    }
    public void helper(int i,int[] nums,List<List<Integer>> l,List<Integer> subset){
        if(i>=nums.length){
            l.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[i]);
        helper(i+1,nums,l,subset);

        subset.remove(subset.size()-1);
        // avoid duplicates
        int j=i+1;
        while(j<nums.length && nums[j]==nums[i]){
            j++;
        }
        helper(j,nums,l,subset);
    }
}