class Solution {
    public int maxSatisfied(int[] cust, int[] gp, int min) {
        int satisfied=0;
        for(int i=0;i<cust.length;i++){
            if(gp[i]==0){
                satisfied+=cust[i];
            }
        }
        int extra= 0;
        for(int i=0;i<min;i++){
            if(gp[i]==1){
                extra+=cust[i];
            }
        }
        int maxSum = extra;
        for(int i=min;i<cust.length;i++){
            if(gp[i-min]==1){
                extra-=cust[i-min];
            }
            if(gp[i]==1){
                extra+=cust[i];
            }
            maxSum = Math.max(maxSum,extra);
        }
        return (satisfied+maxSum);
    }
}