package DP.Tabulation;

class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        arr[0]=1;arr[1]=1;
        for(int ind=2;ind<=n;ind++){            
             arr[ind]+=(arr[ind-1]+arr[ind-2]);
        }
        return arr[n];
    }
}
