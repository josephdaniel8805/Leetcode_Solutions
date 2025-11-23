import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int rank=0,prev=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            prev=entry.getValue();
            map.put(entry.getKey(),rank);
            rank+=prev;
        }
        for(int ind=0;ind<nums.length;ind++){
            nums[ind]=map.get(nums[ind]);
        }
        return nums;
    }
}