class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(Integer i:m.values()) set.add(i);
        if(set.size()==1) return true;
        return false;
    }
}