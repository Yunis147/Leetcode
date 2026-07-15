class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        int freq = m.get(s.charAt(0));
        for(Character ch:m.keySet()){
            if(m.get(ch)!=freq){
                return false;
            }
        }
        return true;
    }
}