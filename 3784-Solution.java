import java.util.*;

class Solution {
    public long minCost(String s, int[] cost){
        HashMap<Character,Long> map = new HashMap<>();
        int n=cost.length;long max=0,total=0;
        for(int ind=0;ind<n;ind++){
            char ch = s.charAt(ind);
            long temp=(long)cost[ind];
            total+=temp;
            map.put(ch,map.getOrDefault(ch,0L)+temp);
            if(max<map.getOrDefault(ch,0L)){
                max=map.getOrDefault(ch,0L);
            }
        }
        for(Map.Entry<Character,Long> entry : map.entrySet()){
            max=Math.max(max,entry.getValue());
        }
        return total-max;
    }
}