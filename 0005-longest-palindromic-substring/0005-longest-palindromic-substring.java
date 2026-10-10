
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max_l = 0;
        int max_len = 1;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (isPalin(s, l, r)) {
                    int len = r - l + 1;

                    if (len > max_len) {
                        max_len = len;
                        max_l = l;
                    }
                }
            }
        }

        return s.substring(max_l, max_l + max_len);
    }

    public boolean isPalin(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
