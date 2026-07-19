class Solution {
    public String removeDuplicateLetters(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        boolean[] visited = new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(visited[ch-'a']){
                freq[ch-'a']--;
                continue;
            }
            while(!st.empty() && st.peek()>ch && freq[st.peek()-'a']>0){
                visited[st.peek()-'a']=false;
                st.pop();
            }
            st.push(ch);
            freq[ch-'a']--;
            visited[ch-'a']=true;
        }
        StringBuilder sb =new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}