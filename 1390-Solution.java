class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int n : nums){
            int count=0,mini=0;
            for(int ind=1;ind*ind<=n;ind++){
                if(n%ind==0){
                    int q=n/ind,p=ind;
                    count++;
                    mini+=p;
                    if(q!=p){
                        mini+=q;
                        count++;
                    }
                    if(count>4) break;
                }
            }
            if(count==4){
               sum+=mini;
            } 
        }
    return sum;
    }
}