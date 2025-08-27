class Solution {
    public int islandPerimeter(int[][] grid) {
        int R=grid.length,C=grid[0].length;
        int perimeter=0;
                    // top   left   bottom right
        int dir[][]= {{-1,0},{0,-1},{1,0},{0,1}};
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]==1){
                    for(int ind=0;ind<4;ind++){
                                    //0+(-1),0+(0)
                        int adjrow=row+dir[ind][0];
                                    //0+(0),0+(-1)
                        int adjcol=col+dir[ind][1];
                        if(adjrow<R && adjrow>=0 && adjcol<C && adjcol>=0){
                            if(grid[adjrow][adjcol]==0){
                                perimeter++;
                            }
                        }else{
                            perimeter++;
                        }
                    }
                }

            }    
        }
        return perimeter;
    }
}