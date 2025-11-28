class Solution {
public:
    long long sumAndMultiply(int n) {
        long long num=0,sum=0,rev=0;
        while(n!=0){
            if((n%10)!=0){
                sum+=(n%10);
                num=num*10+(n%10);
            }
            n/=10;
        }
        while(num!=0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev*sum;
    }
};