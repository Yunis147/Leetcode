class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int left =0;
        int max = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(left))){
                count--;
            }
            left++;
            if(isVowel(s.charAt(i))){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}