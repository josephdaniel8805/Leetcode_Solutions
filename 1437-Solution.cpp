class Solution {
public:
    bool kLengthApart(vector<int>& nums, int k) {
        int prev=-1,prev1=-1;
        for(int ind=0;ind<nums.size();ind++){
            if(nums[ind]==1){
                if(prev==-1){
                    prev=ind;
                }else if(prev1==-1){
                    prev1=ind;
                    if(prev1-prev-1<k){
                        return false;
                    }
                }else{
                    prev=prev1;
                    prev1=ind;
                    if(prev1-prev-1<k){
                        return false;
                    }
                }
            }
        }
        return true;
    }
};