import java.util.*;
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }
        int ind=0;
        for(int num : order){
            if(set.contains(num)){
                friends[ind++]=num;
                System.out.println(num);
            }
        }
        return friends;
    }
}