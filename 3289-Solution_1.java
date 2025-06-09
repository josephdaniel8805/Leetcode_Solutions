import java.util.*;
class Solution {
    //HashSet Approach
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int result[]=new int[2];
        int idx=0;
        for(int i : nums){
            if(set.contains(i)){
                result[idx++]=i;
                if (idx==2) return result;
            }
            set.add(i);
        }
        return result;
    }
}