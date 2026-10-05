class Solution {
    public int findMinArrowShots(int[][] points) {
        int m = points.length;
        Arrays.sort(points,(a,b) -> a[1]-b[1]);
        int last = points[0][1];
        int count = 1;
        for(int i=1;i<m;i++){
            if(points[i][0]<=last && last <= points[i][1]){
                
            }else{
                last = points[i][1];
                count++;
            }
        }
        return count;
    }
}