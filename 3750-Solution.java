class Solution {
    public int minimumFlips(int n) {
        int len=32-Integer.numberOfLeadingZeros(n);  
        int left=0,right=len-1;
        int flips=0;
        while(left<right) {
            int leftBit=(n>>left)&1;
            int rightBit=(n>>right)& 1;
            if (leftBit!=rightBit) {
                flips+=2;  
            }
            left++;
            right--;
        }
        return flips;
    }
    
}