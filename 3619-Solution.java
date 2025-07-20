class Solution {
    private int sum;
    public int countIslands(int[][] grid, int k) {
        int row=grid.length,col=grid[0].length;
        boolean visited[][]= new boolean[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum=0;
                if(!visited[i][j] && grid[i][j]!=0){
                    visited[i][j]=true;
                    sum+=grid[i][j];
                    dfs(visited,grid,i,j,row,col);
                    if((sum%k)==0){
                        sum=0;
                        count++;
                    } 
                }
            }
        }
        return count;
    }
    private void dfs(boolean[][] visited, int[][] grid, int i, int j, int row, int col){
            int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
            for(int d[] :dir){
                int x=i+d[0];
                int y=j+d[1];
                if(x>=0 && x<row && y>=0 && y<col){
                    if(!visited[x][y] && grid[x][y]!=0){
                        visited[x][y]=true;
                        sum+=grid[x][y];
                        dfs(visited,grid,x,y,row,col);
                    }
                }
            }
        }
}