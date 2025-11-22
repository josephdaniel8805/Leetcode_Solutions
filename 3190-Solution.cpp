class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int oper=0;
        for(int ind=0;ind<nums.size();ind++){
            if(nums[ind]%3!=0) oper++;
        }
        return oper;
    }
};