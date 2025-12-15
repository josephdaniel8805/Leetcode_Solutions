class Solution {
    public long getDescentPeriods(int[] prices) {
        long n=prices.length,count=1,curr=1;
        for(int ind=1;ind<n;ind++){
            if(prices[ind]==(prices[ind-1]-1)){
                curr++;
            }else{
                curr=1;
            }
            count+=curr;
        }
        return count;
    }
}