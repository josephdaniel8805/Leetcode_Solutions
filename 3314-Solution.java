import java.util.*;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]= new int[n];
        for(int ind=0;ind<n;ind++){
            int or=-1,num=nums.get(ind);
            for(int j=1;j<num;j++){
                if((j|(j+1))==num){
                    or=j;
                    break;
                }
            }
            ans[ind]=or;
        }
        return ans;
    } 
}