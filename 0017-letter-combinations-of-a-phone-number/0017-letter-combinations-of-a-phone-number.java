class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> s = new ArrayList<>();
        if(digits.length()==0) return s;
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb = new StringBuilder();
        helper(0,map,digits,s,sb);
        return s;

    }
    public void helper(int i,String[] map ,String digits ,List<String> s ,StringBuilder sb){
        
        if(i==digits.length()){
            s.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(i)-'0'];
        for(char ch : letters.toCharArray()){
            sb.append(ch);
            helper(i+1,map,digits,s,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}