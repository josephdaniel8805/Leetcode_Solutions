import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        int start=0,end=0,dist=0,n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ind=0;ind<n;ind++){
            map.put(nums[ind],map.getOrDefault(nums[ind],0)+1);
            if(map.getOrDefault(nums[ind],0)==1) dist++;
        }
        if(n==map.size()) return 0;
        end+=3;
        int oper=0;
        while((n-start)!=dist){
            for(int ind=start;ind<n && ind<end;ind++){
                if(map.getOrDefault(nums[ind],0)==1) dist--;
                map.put(nums[ind],map.getOrDefault(nums[ind],0)-1);
            }
            oper++;
            if(dist==0) break;
            if(end>=n){
                end=n;
            }
            start=end;
            end+=3;
        }
        return oper;
    }
}