class Solution {
    public int minimumPrefixLength(int[] nums) {
        int ans=0;
        for(int ind=nums.length-1;ind>0;ind--){
            if(nums[ind-1]>=nums[ind]){
                ans=ind;
                break;
            }
        }
        return ans;
    }
}