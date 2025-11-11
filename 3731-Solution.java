import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> list= new ArrayList<>();
        for(int num : nums){
            set.add(num);
        }
        for(int ind=set.first();ind<=set.last();ind++){
            if(!set.contains(ind)){
                list.add(ind);
            }
        }
        return list;
    }
}