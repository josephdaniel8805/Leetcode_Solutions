class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int n=nums.size(),sum=0,count=0,curr=0;
        for(int ind=0;ind<n;ind++){
            sum+=nums[ind];
        }
        for(int ind=0;ind<n-1;ind++){
            curr+=nums[ind];
            sum-=nums[ind];
            if((sum&1)==(curr&1)){
                count++;
            }
        }
        return count;
    }
};