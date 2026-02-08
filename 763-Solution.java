import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int count=0, ind=0;
        for(char ch : s.toCharArray()){
            map.put(ch,ind);
            ind++;
        }
        int max=map.getOrDefault(s.charAt(0),0),start=0;
        for(ind=0;ind<s.length();ind++){
            char ch = s.charAt(ind);
            if(map.getOrDefault(ch,0)>max){
                max=map.getOrDefault(ch,0);
            }else if(map.getOrDefault(ch,0)==max && ind==max){
                if((ind+1)<s.length()){
                    list.add(max-start+1);
                    max=map.getOrDefault(s.charAt(ind+1),0);
                    start=ind+1;
                } 
            }
        }
        if(map.getOrDefault(s.charAt(s.length()-1),0)==max && (s.length()-1)==max){
            list.add(max-start+1);
            max=map.getOrDefault(s.charAt(s.length()-1),0);
        }
        return list;
    }
}