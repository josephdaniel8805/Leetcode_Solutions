import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        TreeMap<Integer,List<List<Integer>>> map = new TreeMap<>(); 
        for(int ind=1;ind<arr.length;ind++){
            int temp=arr[ind]-arr[ind-1];
            map.computeIfAbsent(temp,k->new ArrayList<>()).add(new ArrayList<>(Arrays.asList(arr[ind-1],arr[ind])));
        }
        return map.firstEntry().getValue();
    }
}