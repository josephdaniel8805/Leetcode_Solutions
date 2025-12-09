package DP.Memoization.Tabulation;

class Solution {
    public int fib(int n) {
        int arr[]= new int[n+1];
        if(n==1) return 1;
        if(n==0) return 0;
        arr[0]=0;arr[1]=1;
        for(int ind=2;ind<=n;ind++){
            arr[ind]+=(arr[ind-1]+arr[ind-2]);
        }
        return arr[n];
    }
}
