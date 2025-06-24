import java.util.*;
class Solution {
    //Brute Force Approach
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                for(int x=i-k;x<=i+k;x++){
                    if(x>=0 && x<nums.length){
                        set.add(x);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}