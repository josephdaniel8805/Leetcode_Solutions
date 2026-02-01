class Solution {
    public int minimumCost(int[] nums) {
        int ans=0,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        if(nums.length<4){
            for(int num : nums){
                ans+=num;
            }
            return ans;
        }
        ans+=nums[0];
        for(int ind=1;ind<nums.length;ind++){
            if(nums[ind]<=min1){
                min2=min1;
                min1=nums[ind];
            }else if(nums[ind]<=min2 && min1<=nums[ind]){
                min2=nums[ind];
            }
        }
        ans+=(min1+min2);
        return ans;
    }
}