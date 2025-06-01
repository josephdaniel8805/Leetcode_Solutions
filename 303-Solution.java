class NumArray {
    private int prefix[];
    public NumArray(int[] nums) {
        prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
    }
    //i  0  1  2   3  4   5
    //p  1  2  3   4  5   6
    //v -2 -2  1  -4 -2  -3
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */