class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0,temp=0;
        for(int ind=0;ind<nums.size();ind++){
            if(nums[ind]==1){
                temp++;
            }else{
                count=(temp>count)?temp:count;
                temp=0;
            }
        }
        count=(temp>count)?temp:count;
        return count;
    }
};