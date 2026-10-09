class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        helper(0,s,l,temp);
        return l;
    }
    public void helper(int start,String s,List<List<String>> l,List<String> temp){
        if(start>=s.length()){
            l.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<s.length();i++){
            String sub = s.substring(start,i+1);
            if(isPalin(sub)){
                temp.add(sub);
                helper(i+1,s,l,temp);
                temp.remove(temp.size()-1);
            }

        }
    }
    public boolean isPalin(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}