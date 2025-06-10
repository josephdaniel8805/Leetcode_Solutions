import java.util.*;
class Solution {
    //TreeMap Approach
    public int maxDifference(String s) {
       int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        TreeSet<Integer> odd = new TreeSet<>();
        TreeSet<Integer> even = new TreeSet<>();
         for(int i : arr){
            if(i<=0){
                continue;
            }
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        return odd.last()-even.first();
    }

}