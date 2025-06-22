import java.util.*;
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> words = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int ptr=0;
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            ptr++;
            if(ptr==k){
                words.add(sb.toString());
                sb.setLength(0);
                ptr=0;
            }
        }
        while(ptr!=k && ptr!=0){
            sb.append(fill);
            ptr++;
            if(ptr==k){
                words.add(sb.toString());
            }
        }
        return words.toArray(new String[0]);
    }
}