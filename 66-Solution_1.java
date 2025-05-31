class Solution {
    //Brute Force Approach
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int sum=0,j=1;
        for(int i=n-1;i>=0;i--){
            sum+=(digits[i]*j);
            j*=10;
        }
        int temp=++sum,count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int res[]=new int[count];
        for(int i=count-1;i>=0;i--){
            res[i]=sum%10;
            sum/=10;
        }
        return res;
    }
}