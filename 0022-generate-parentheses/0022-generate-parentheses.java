class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n,0,0,s,sb);
        return s;
    }
    public void helper(int n , int open , int close ,
                        List<String> s,StringBuilder sb){
                            if(open==n && close==n){
                                s.add(sb.toString());
                                return;
                            }

                            // Add '('
                            if(open<n){
                                sb.append('(');
                                helper(n,open+1,close,s,sb);
                                sb.deleteCharAt(sb.length()-1);
                            }

                            // Add ')'
                            if(close<open){
                                sb.append(')');
                                helper(n,open,close+1,s,sb);
                                sb.deleteCharAt(sb.length()-1);
                            }
                        }
}