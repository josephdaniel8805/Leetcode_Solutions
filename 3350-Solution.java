class Solution {
    public int smallestIndex(int[] nums) {
        int ans=-1;
        for(int ind=0;ind<nums.length;ind++){
            if(ind==digit(nums[ind])){
                ans=ind;
                break;
            }
        }
        return ans;
    }
    private static int digit(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}