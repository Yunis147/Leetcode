class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // Current string ended
                if (i == strs[j].length()) {
                    return first.substring(0, i);
                }

                // Characters don't match
                if (ch != strs[j].charAt(i)) {
                    return first.substring(0, i);
                }
            }
        }

        // Entire first string is the common prefix
        return first;
    }
}