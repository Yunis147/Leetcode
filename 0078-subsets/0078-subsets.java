class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(0,nums,subset,l);
        return l;
    }
    public void helper(int i , int[] nums ,
                        List<Integer> subset ,
                        List<List<Integer>> l){
        if(i>=nums.length){
            l.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        helper(i+1,nums,subset,l);

        subset.remove(subset.size()-1);
        helper(i+1,nums,subset,l);
    }
}