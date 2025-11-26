class Solution {
    public int uniquePaths(int m, int n) {
        int grid[][]= new int[m][n];
        grid[0][0]=1;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                int top=row-1,left=col-1;
                if(top>=0){
                    grid[row][col]+=grid[top][col];
                }
                if(left>=0){
                    grid[row][col]+=grid[row][left];
                }
            }
        }
        return grid[m-1][n-1];
    }
}