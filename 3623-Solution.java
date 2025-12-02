import java.util.*;
class Solution {
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int p[] : points){
            map.put(p[1],map.getOrDefault(p[1],0)+1);
        }
        long mod = 1_000_000_007L;
        long sum=0,sqsum=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            long k=entry.getValue();
            if(entry.getValue()>1){
                long seg=(k*(k-1)/2)%mod;
                sum=(sum+seg)%mod;
                sqsum=(sqsum+(seg*seg)%mod)%mod;
            }
        }
        long inv2=(mod+1)/2; 
        long sub=((sum*sum)%mod-sqsum+mod)%mod;
        long ans = (sub*inv2)%mod;
        return (int)ans;
    }
}