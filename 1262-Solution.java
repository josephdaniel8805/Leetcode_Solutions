class Solution {
    public int maxSumDivThree(int[] nums) {
        int dp[] = new int[3];
        dp[1]=dp[2]=Integer.MIN_VALUE/2;
        for(int num : nums){
            int ind=num%3;
            int prev[]=dp.clone();
            dp[(ind+0)%3]=Math.max(dp[(ind+0)%3],prev[0]+num);
            dp[(ind+1)%3]=Math.max(dp[(ind+1)%3],prev[1]+num);
            dp[(ind+2)%3]=Math.max(dp[(ind+2)%3],prev[2]+num);
        }
        return dp[0];
    }
}