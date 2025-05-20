class Solution {
    //brute force approach
    public boolean isZeroArray(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0],b=queries[i][1];
            for(int j=a;j<=b;j++){
                nums[j]--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return false;
            }
        }
        return true;
    }
}