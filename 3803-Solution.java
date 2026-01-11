import java.util.*;

class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int ind=1,count=0;
        for(char ch : s.toCharArray()){
            set.add(ch);
            if((ind%3)==(set.size())){
                count++;
            }
            ind++;
        }
        return count;
    }
}