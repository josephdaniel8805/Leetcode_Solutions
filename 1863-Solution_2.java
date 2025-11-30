class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=0,n=nums.length;
        for(int num : nums){
            ans|=num;
        }
        return ans<<(n-1);
    }
}