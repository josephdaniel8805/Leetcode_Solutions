import java.util.*;

class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int n=s.length();
        for(int ind=n-1;ind>=0;ind--){
            char ch=s.charAt(ind);
            if(ch<='z' && 'a'<=ch){
                sb.append(ch);
            }else{
                list.add(ind);
            }
        }
        for(int ind=n-1,ptr=list.size()-1;ind>=0;ind--){
            char ch=s.charAt(ind);
            if(ch<='z' && 'a'<=ch){
                continue;
            }else{
                sb.insert((int)list.get(ptr--),ch);
            }
        }
        return sb.toString();
    }
}