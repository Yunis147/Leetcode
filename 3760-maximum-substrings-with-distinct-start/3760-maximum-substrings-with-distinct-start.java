class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                count++;
            }
        }

        return count;
    }
}