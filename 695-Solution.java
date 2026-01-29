class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int R=grid.length,C=grid[0].length,ans=0;
        boolean visited[][] = new boolean[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(!visited[row][col] && grid[row][col]==1){
                    visited[row][col]=true;
                    int size=dfs(row,col,R,C,grid,visited)+1;
                    ans=(ans<size)?size:ans;
                }
            }
        }
        return ans;
    }
    private int dfs(int row, int col, int R, int C, int grid[][], boolean visited[][]){
        int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
        int size=0;
        for(int ind=0;ind<4;ind++){
            int newrow=dir[ind][0]+row;
            int newcol=dir[ind][1]+col;
            if(newrow<R && newcol<C && newrow>=0 && newcol>=0 && !visited[newrow][newcol]){
                visited[newrow][newcol]=true;
                if(grid[newrow][newcol]==1){
                    size+=(1+dfs(newrow,newcol,R,C,grid,visited));
                }
            }
        }
        return size;
    }
}