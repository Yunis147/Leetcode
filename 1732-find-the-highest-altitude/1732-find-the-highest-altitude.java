class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int sum=0;
        int max = 0;
        int alt[] = new int[n+1];
        alt[0]=0;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            alt[i+1]=sum;
            max = max>alt[i+1]?max:alt[i+1];
        }
        return max;
    }
}