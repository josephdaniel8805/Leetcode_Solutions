import java.util.*;
class Solution {
    //Optimal Approach 
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] seen=new boolean[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int start=Math.max(0,i-k);
                int end=Math.min(n-1,i+k);
                for(int j=start;j<=end;j++){
                    seen[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(seen[i]){
                list.add(i);
            }
        }
        return list;
    }
}