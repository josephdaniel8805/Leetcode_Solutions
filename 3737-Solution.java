class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int dresanial[]=new int[nums.length];
        for(int ind=0;ind<nums.length;ind++){
            dresanial[ind]=(target==nums[ind])?1:-1; 
        }
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i;j<nums.length;j++){
                temp+=dresanial[j];
                if(temp>0){
                    count++;
                }
            }
        }
        return count;
    }
}