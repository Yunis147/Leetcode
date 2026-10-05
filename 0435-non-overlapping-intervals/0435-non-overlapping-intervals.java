class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        int m = in.length;
        Arrays.sort(in ,(a,b) -> a[1]-b[1]);
        int count = 0;
        int last = in[0][1];
        for(int i=1;i<m;i++){
            if(in[i][0]<last){
                count++;
            }else{
                last = in[i][1];
            }
        }
        return count;
    }
}