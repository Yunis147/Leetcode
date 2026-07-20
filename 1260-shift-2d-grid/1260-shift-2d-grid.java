class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> l = new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++) {
                row.add(0); 
            }
            l.add(row);
        }
        int total=m*n;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int index=i*n+j;
                int newIndex = (index+k)%total;
                int newRow = newIndex/n;
                int newCol = newIndex%n;
                l.get(newRow).set(newCol,grid[i][j]);
            }
        }
        return l;
    }
}