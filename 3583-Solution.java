import java.util.*;
class Solution {
    public int specialTriplets(int[] nums) {
        long mod=1_000_000_007;
        long count=0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        for(int num : nums) {
            right.put(num,right.getOrDefault(num,0)+1);
        }
        for(int j=0;j<nums.length;j++) {
            int val=nums[j];
            right.put(val,right.get(val)-1);
            int need=val*2;
            long leftCount=left.getOrDefault(need,0);
            long rightCount=right.getOrDefault(need,0);
            count=(count+(leftCount*rightCount)%mod)%mod;
            left.put(val,left.getOrDefault(val,0)+1);
        }
        return (int)count;
    }
}