package DP.Tabulation;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[] = new int[n];
        dp[0]=cost[0]; 
        dp[1]=cost[1];
        for(int ind=2;ind<n;ind++){
            dp[ind]+=(cost[ind]+Math.min(dp[ind-1],dp[ind-2]));
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    
}
