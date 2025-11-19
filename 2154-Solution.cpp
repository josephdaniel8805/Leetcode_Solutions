class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        sort(nums.begin(),nums.end());
        for(int ind=0;ind<nums.size();ind++){
            if(nums[ind]==original){
                original*=2;
            }
        }
        return original;
    }
};