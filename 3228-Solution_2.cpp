class Solution {
public:
    int maxOperations(string s) {
        int one=0,count=0;
        if(s[0]=='1'){
            one++;
        }
        for(int ind=1;ind<s.length();ind++){
            if(s[ind]=='1'){
                one++;
            }else if(s[ind]=='0' && s[ind-1]=='1'){
                count+=one;
            }
        }
        return count;
    }
};