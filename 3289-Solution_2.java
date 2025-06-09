class Solution {
    //Optimal Approach
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] freq = new int[n];
        int[] result = new int[2];
        int index = 0;
        for (int num : nums) {
            freq[num]++;
            if (freq[num]==2) result[index++]=num;
        }
        return result;
    }
}