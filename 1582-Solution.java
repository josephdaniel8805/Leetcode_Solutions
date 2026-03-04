class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];
        for(int r=0;r<mat.length;r++){
            for(int c=0;c<mat[0].length;c++){
                if(mat[r][c]==1){
                    row[r]++;
                    col[c]++;
                }
            }
        }
        for(int r=0;r<mat.length;r++){
            if(row[r]!=1) continue;
            for(int c=0;c<mat[0].length;c++){
                if(mat[r][c]==1 && row[r]==1 && col[c]==1){
                    count++;
                }
            }
        }
        return count;
    }
}