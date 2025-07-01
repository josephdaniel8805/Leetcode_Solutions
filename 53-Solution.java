class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,sum=0,max=nums[0];
        for(int j=0;j<n;j++){
            sum+=nums[j];
            max=(max>sum)?max:sum;
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}