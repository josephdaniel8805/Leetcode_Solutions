class Solution {
    // Brute Force Approach
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        int count=0;
        for(int k : nums){
            if(k==val){
                count++;
            }
        }
        while(i<j){
            if(nums[j]==val){
                j--;
                continue;
            }else if(nums[i]==val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            i++;
        }
        return nums.length-count;
    }
}