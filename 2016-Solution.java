class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                min=(min<nums[i])?min:nums[i];
                max=((nums[i+1]-min)>max)?(nums[i+1]-min):max;
            }
        }
        return max;
    }
}