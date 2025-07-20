class Solution {
    public long splitArray(int[] nums) {
        long sum_a=0,sum_b=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)){
                sum_a+=nums[i];
            }else{
                sum_b+=nums[i];
            }
        }
        return Math.abs(sum_a-sum_b);
    }
    private boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;  
    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}

}