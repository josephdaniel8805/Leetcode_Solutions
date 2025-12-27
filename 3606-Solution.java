import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        TreeMap<String,List<String>> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(int s=0;s<code.length;s++){
            String str=code[s],bus=businessLine[s];
            int n=str.length();
            boolean flag=true;
            if(str.equals("")){
                flag=false;
                continue;
            }
            for(int ind=0;ind<n;ind++){
                char ch=str.charAt(ind);
                if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9') || ch=='_'){
                    continue;
                }else{
                    flag=false;
                    break;
                }
            }
            if(((!bus.equals("electronics")) && (!bus.equals("grocery")) && (!bus.equals("pharmacy")) && (!bus.equals("restaurant")))){
                flag=false;
            }
            if(isActive[s] && flag){
                if(map.containsKey(bus)){
                    list=map.get(bus);
                    list.add(str);
                    map.put(bus,list);
                }else{
                    list=new ArrayList<>();
                    list.add(str);
                    map.put(bus,list);
                }
            }
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            list=entry.getValue();
            Collections.sort(list);
            for(String s : list){
                result.add(s);
            }
        }
        return result;
    }
}