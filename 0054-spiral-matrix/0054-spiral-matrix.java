class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int u=0;
        int b=matrix.length-1;
        int l=0;
        int r=matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(u<=b&&l<=r){
            for(int i=l;i<=r;i++){
                list.add(matrix[u][i]);
            }
            u++;
            for(int i=u;i<=b;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if(u<=b){
                for(int i=r;i>=l;i--){
                list.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=u;i--){
                list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}