class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,0,candidates,target,l,temp);
        return l;
    }
    public void helper(int start ,int sum,int[] candidates, int target,List<List<Integer>> l,List<Integer> temp){
        if(sum==target){
            l.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(sum+candidates[i]>target) continue;
            sum+=candidates[i];
            temp.add(candidates[i]);
            helper(i,sum,candidates,target,l,temp);
            sum-=candidates[i];
            temp.remove(temp.size()-1);
        }
    }
}