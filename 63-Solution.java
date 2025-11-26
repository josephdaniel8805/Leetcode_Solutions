class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        int grid[][]= new int[m][n];
        grid[0][0]=1;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(obstacleGrid[row][col]==1){
                    grid[row][col]=0;
                    continue;
                }
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