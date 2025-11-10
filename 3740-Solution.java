import java.util.*;
class Solution {
    public int minimumDistance(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int row=0;row<nums.length;row++){
            for(int col=row+1;col<nums.length;col++){
                for(int ind=col+1;ind<nums.length;ind++){
                    if(nums[row]==nums[col] && nums[col]==nums[ind]){
                        set.add(Math.abs(row-col)+Math.abs(col-ind)+Math.abs(ind-row));
                    }
                }
            }
        }
        if(set.size()==0) return -1;
        return set.first();
    }
}