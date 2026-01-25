import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k<=1) return 0;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;k--;
        for(int ind=nums.length-1;(ind-k)>=0;ind--){
            if(ans>(nums[ind]-nums[ind-k])){
                ans=nums[ind]-nums[ind-k];
            }
        }
        return ans;
    }
}