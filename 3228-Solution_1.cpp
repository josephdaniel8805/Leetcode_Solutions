class Solution {
public:
    int maxOperations(string s) {
        vector<int> dp(s.length()+1);
        map<int,int> map;
        int count=0;
        for(int ind=1;ind<=s.length();ind++){
            if(s[ind-1]=='1'){
                dp[ind]+=(dp[ind-1]+1);
            }else{
                dp[ind]+=dp[ind-1];
            }
        }
        for(int ind=0;ind<=s.length();ind++){
            map[dp[ind]]++;
        }
        for (auto &p : map) {
            if(p.second>1){
                count+=p.first;
            }
        }

        return count;
    }
};