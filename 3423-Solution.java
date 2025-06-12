class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE,n=nums.length;
        for(int i=0;i<=n;i++){
            max=(max<Math.abs(nums[i%n]-nums[(i+1)%n]))?Math.abs(nums[i%n]-nums[(i+1)%n]):max;
        }
        return max;
    }
}