class Solution {
    //Recursive Approach 
    public int search(int[] nums, int target){
        int n=nums.length;
        int low=0,high=n-1;
        return bin(low,high,target,nums);
    }
    public int bin(int low,int high,int target,int[] nums){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            return bin(mid+1,high,target,nums);
        }else{
            return bin(low,mid-1,target,nums);
        }
    }
}