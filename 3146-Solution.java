import java.util.*;
class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=0;
        for(int ind=0;ind<s.length();ind++){
            map.put(s.charAt(ind),ind);
        }
        for(int ind=0;ind<t.length();ind++){
            ans+=(Math.abs(map.get(t.charAt(ind))-ind));
        }
        return ans;
    }
}