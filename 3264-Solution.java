class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            int min=Integer.MAX_VALUE,pos=0;
            for(int ind=nums.length-1;ind>=0;ind--){
                if(min>=nums[ind]){
                    min=nums[ind];
                    pos=ind;
                }
            }
            nums[pos]*=multiplier;
        }
        return nums;
    }
}