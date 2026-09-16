class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> se = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            while(se.contains(ch)){
                se.remove(s.charAt(left));
                left++;
            }
            se.add(ch);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}