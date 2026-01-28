class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for(int row=0;row<nums1.length;row++){
            for(int col=0;col<nums2.length;col++){
                if(nums1[row]%(nums2[col]*k)==0) count++;
            }
        }
        return count;
    }
}