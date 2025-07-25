class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int sum=0;
        for(int ind=0;ind<n;ind++){
            left[ind]=sum;
            sum+=nums[ind];
        }
        sum=0;
        for(int ind=n-1;ind>=0;ind--){
            right[ind]=sum;
            sum+=nums[ind];
        }
        int result[] = new int[n];
        for(int ind=0;ind<n;ind++){
            result[ind]=Math.abs(left[ind]-right[ind]);
        }
        return result;
    }
}