class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MAX_VALUE;
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]>a){
                b=a;
                a=nums[ind];
            }else if(nums[ind]>b && nums[ind]<=a){
                b=nums[ind];
            }
            if(nums[ind]<c){
                c=nums[ind];
            }
        }
        return a+b-c;
    }
}