import java.util.*;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int count=0;
        int arr[] = new int[n];
        if(n==0) return arr;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ind=0;ind<n;ind++){
            map.put(A[ind],map.getOrDefault(A[ind],0)+1);
            map.put(B[ind],map.getOrDefault(B[ind],0)+1);
            if(map.getOrDefault(B[ind],0)==2 && map.getOrDefault(A[ind],0)==2 && B[ind]!=A[ind]){
                count+=2;
            }else if(map.getOrDefault(B[ind],0)==2 || map.getOrDefault(A[ind],0)==2){
                count++;
            }
            arr[ind]=count;
        }
        return arr;        
    }
}