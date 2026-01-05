class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long neg=0,min=Integer.MAX_VALUE,sum=0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                sum+=Math.abs(matrix[row][col]);
                if(Math.abs(matrix[row][col])<min){
                    min=Math.abs(matrix[row][col]);
                }
                if(matrix[row][col]<0){
                    neg++;
                }
            }
        }
        if(neg%2==0) return sum;
        return sum-(min*2);
    }
}