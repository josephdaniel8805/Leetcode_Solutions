class Solution {
    public int differenceOfSums(int n, int m) {
        int total_sum=(n)*(n+1)/2;
        int k=n/m;
        int sum=m*k*(k + 1)/2;
        return total_sum-2*sum;
    }
}