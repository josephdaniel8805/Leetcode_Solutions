package DP.Tabulation;

class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        if(n==1){
            return costs[0]+1;
        }
        dp[0]=0; 
        dp[1]=costs[0]+1;
        dp[2]=costs[1]+Math.min(dp[1]+1,dp[0]+4);
        for(int ind=3;ind<=n;ind++){
            dp[ind]+=(costs[ind-1]+Math.min(Math.min(dp[ind-1]+1,dp[ind-2]+4),dp[ind-3]+9));
        }
        return dp[n];
    }
}
