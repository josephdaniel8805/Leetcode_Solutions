import java.util.*;
class Solution {
    public int minimumDeletions(String word, int k) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c-'a']++;
        }
        HashSet<Integer> set=new HashSet<>();
        for (int f : arr) {
            if (f>0) set.add(f);
        }
        int answer=Integer.MAX_VALUE;
        for(int target : set){
            int deletions=0;
            for(int freq : arr){
                if(freq<target){
                    deletions+=freq;
                }else if(freq>target+k){
                    deletions+=freq-(target+k);
                }
            }
            answer=Math.min(deletions,answer);
        }
        return answer;
    }
}