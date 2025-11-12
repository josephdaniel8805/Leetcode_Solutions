class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> ans(n*2);
        for(int ind=0,i=0,j=n;ind<n*2;ind++){
            if(ind%2==0){
                ans[ind]=nums[i++];
            }else{
                ans[ind]=nums[j++];
            }
        }
        return ans;
    }
};