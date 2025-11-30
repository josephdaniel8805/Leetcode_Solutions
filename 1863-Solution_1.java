class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(0,0,nums);
    }
    private int dfs(int index,int value, int[] nums){
        if(nums.length==index){
            return value;
        }
        return dfs(index+1,value^nums[index],nums)+dfs(index+1,value,nums);
    }
}