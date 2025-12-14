import java.util.*;
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int large=0,small=0;
        for(int ind=0,rev=nums.length-1;ind<nums.length && k>0;ind++,rev--,k--){
            large+=nums[rev];
            small+=nums[ind];
        }
        return Math.abs(large-small);
    }
}