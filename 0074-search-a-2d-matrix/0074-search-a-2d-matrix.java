class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length;
        int n=mat[0].length;
        int sr = 0;
        int er = m-1;
        while(sr<=er){
            int midr = (sr+er)/2;
            if((mat[midr][0]<=target)&&(target<=mat[midr][n-1])){
                return searchInRow(mat,target,midr);
            }else if(target>mat[midr][n-1]){
                sr=midr+1;
            }else{
                er=midr-1;
            }
        }
        return false;
    }
    public boolean searchInRow(int[][] mat,int target,int row){
        int m=mat[0].length;
        int sc=0;
        int ec=m-1;
        while(sc<=ec){
            int midc=(sc+ec)/2;
            if(mat[row][midc]==target){
                return true;
            }else if(mat[row][midc]>target){
                ec=midc-1;
            }else{
                sc=midc+1;
            }
        }
        return false;
    }
}