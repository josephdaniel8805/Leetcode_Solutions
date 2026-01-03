import java.util.*;

class Solution{
    public int minLength(int[] nums, int k){
        int sum=0,ans=nums.length+ 2,ptr=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ind=0;ind<nums.length;ind++) {
            map.put(nums[ind],map.getOrDefault(nums[ind],0)+1);
            if(map.get(nums[ind])==1){
                sum += nums[ind];
            }
            while(sum >= k){
                ans = Math.min(ans,ind- ptr+1);
                map.put(nums[ptr],map.get(nums[ptr])-1);
                if(map.get(nums[ptr])==0){
                    sum-=nums[ptr];
                    map.remove(nums[ptr]);
                }
                ptr++;
            }
        }
        if(ans==nums.length+2) return -1;
        return ans;
    }
}