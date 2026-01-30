class Solution {
    public int[][] largestLocal(int[][] grid) {
        int R=grid.length,C=grid[0].length;
        int ans[][] = new int[R-2][C-2];
        for(int row=0;row<=(R-3);row++){
            for(int col=0;col<=(C-3);col++){
                int max=grid[row][col];
                for(int inrow=row;inrow<(row+3);inrow++){
                    for(int incol=col;incol<(col+3);incol++){
                        max=(max>grid[inrow][incol])?max:grid[inrow][incol];
                    }
                }
                ans[row][col]=max;
            }
        }
        return ans;
    }
}