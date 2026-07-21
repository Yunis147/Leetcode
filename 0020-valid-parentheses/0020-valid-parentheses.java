class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                s.push(ch);
            }else{
                if(s.empty()){
                    return false;
                }
                char top = s.pop();
                if((top=='(' && ch!=')') || (top=='{' && ch!='}') || (top=='[' && ch!=']')){
                    return false;
                }
            }
        }
        return s.empty();
    }
}