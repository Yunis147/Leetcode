class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> m = new HashMap<>();
        while(n!=0){
            int ld = n%10;
            n=n/10;
            m.put(ld,m.getOrDefault(ld,0)+1);
        }
        int sum=0;
        for(Integer i:m.keySet()){
            sum+= i*m.get(i);
        }
        return sum;
    }
}