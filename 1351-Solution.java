class Solution {
    public int countNegatives(int[][] nums) {
        int n=nums.length,m=nums[0].length,c=0;
        for(int i=0;i<n;i++){
            int low=0,high=m-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums[i][mid]<0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }c+=m-low;
        }
    return c;  
    }
}