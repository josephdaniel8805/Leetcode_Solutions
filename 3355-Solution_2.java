class Solution {
    //Optimal Approach
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] diff=new int[n+1];
        for(int[] i: queries){
            diff[i[0]]--;
            if(i[1]<n+1){
                diff[i[1]+1]++;
            }
        } 
        int subtractor=0;
        for(int i=0;i<n;i++){
            subtractor+=diff[i];
            nums[i]+=subtractor;
            if(nums[i]>0){
                return false;
            }
        }
        return true;
    }
}