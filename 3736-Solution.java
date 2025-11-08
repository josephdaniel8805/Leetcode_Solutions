class Solution {
    public int minMoves(int[] nums) {
        int sum=0,max=0;
        for(int num : nums){
            sum+=num;
            max=(num>max)?num:max;
        }
        return (max*nums.length)-sum;
    }
}