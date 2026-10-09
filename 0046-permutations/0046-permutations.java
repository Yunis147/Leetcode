class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(used,nums,l,temp);
        return l;
    }
    public void helper(boolean[] used,int[] nums,List<List<Integer>> l,List<Integer> temp){
        if(temp.size()==nums.length){
            l.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            
            temp.add(nums[i]);
            used[i] = true;
            helper(used,nums,l,temp);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
        
    }
}