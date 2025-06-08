import java.util.*;
class Solution {
    //TreeSet Approach
    public List<Integer> lexicalOrder(int n) {
        TreeSet<String> nums=new TreeSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(Integer.toString(i));
        }
        for(String i : nums){
            result.add(Integer.parseInt(i));
        }
        return result;
    }
}