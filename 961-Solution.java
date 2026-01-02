import java.util.*;

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int ind=0;ind<n;ind++){
            map.put(nums[ind],map.getOrDefault(nums[ind],0)+1);
            if(map.getOrDefault(nums[ind],0)==(n/2)) return nums[ind];
        }
        return -1;
    }
}