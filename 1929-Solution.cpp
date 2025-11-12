class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=nums.size();
        vector<int> arr(n*2);
        for(int ind=0;ind<n*2;ind++){
            arr[ind]=nums[ind%n];
        }
        return arr;
    }
};