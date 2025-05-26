class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ptr=0;
        if(m*n!=original.length){
            return new int[][]{};
        }
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[ptr++];
            }
        }
        return arr;
    }
}