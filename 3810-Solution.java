class Solution {
    public int minOperations(int[] nums, int[] target) {
        boolean[] arr = new boolean[100001]; 
        int count=0;
        for(int ind=0;ind<nums.length;ind++){
            if(!arr[nums[ind]] && nums[ind]!=target[ind]){
                arr[nums[ind]]=true;
                count++;
            }
        }
        return count;
    }
}