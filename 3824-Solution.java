class Solution {
    public int minimumK(int[] nums) {
        int k=1,n=nums.length;
        while(true){
            long oper=0;
            for(int ind=0;ind<n;ind++){
                oper+=(nums[ind]+k-1)/k;
                if(oper>(long)(k*k)) break;
            }
            if(oper<=(long)(k*k)) {
                break;
            }
            k++;
        }
        return k;
    }
}